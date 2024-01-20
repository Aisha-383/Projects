package com.operations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.HiberConfig;
import com.entity.RailwayCrossing;
import com.entity.admin;


public class AdminOperations {
    private List<RailwayCrossing> crossings;
    SessionFactory sf = null;

    public AdminOperations() {
        sf = HiberConfig.GetConnection();
        System.out.println("Cons");
        this.crossings = new ArrayList<>();
    }
	
    public boolean validateAdmin(String adminname, String password) {
        try (Session session = sf.openSession()) {
        	 TypedQuery<admin> qry = session.createQuery("from admin where adminname=:adminname and Password=:password", admin.class);
             qry.setParameter("adminname",adminname);
             qry.setParameter("password", password);

             List<admin> adminList = qry.getResultList();

             return !adminList.isEmpty();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
   
	  
	
		public int AddCrossing(RailwayCrossing cross)
		{
			int res = -1;
			try {
				Session session = sf.openSession();
				Transaction trans = session.beginTransaction();
				
				Serializable sz = session.save(cross);
				trans.commit();			
				res = (Integer)sz;
				System.out.println("Railway Crossing Inserted with id " + res);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				res = -1;
			}
			
			return res;
		}
		
		public List<RailwayCrossing> ShowAll() {
		    Session session = sf.openSession();
		    TypedQuery<RailwayCrossing> qry = session.createQuery("from RailwayCrossing", RailwayCrossing.class);
		    List<RailwayCrossing> crossList = qry.getResultList();
		    System.out.println("Number of railway crossings retrieved: " + crossList.size());
		    return crossList;
		}

		
		public RailwayCrossing SearchCrossing(String crossingName) {
	        for (RailwayCrossing crossing : this.crossings) {
	            if (crossing.getName().equals(crossingName)) {
	                return crossing;
	            }
	        }
	        return null; // Crossing not found
	    }
	

	    public int deleteCrossing(int crossingId) {
	        int result = -1;
	        try {
	            Session session = sf.openSession();
	            Transaction trans = session.beginTransaction();
	            RailwayCrossing crossing = session.load(RailwayCrossing.class, crossingId);
	            if (crossing != null) {
	                session.delete(crossing);
	                trans.commit();
	                result = 1; 
	            } else {
	                trans.rollback();
	            }
	            session.close();
	        } catch (Exception e) {
	       
	            System.out.println(e);
	        }
	        return result;
	    }
		
	    
		public int updateCrossing(RailwayCrossing crossing) {
	        Session session = sf.openSession();
	        Transaction transaction = null;
	        int result = -1;

	        try {
	            transaction = session.beginTransaction();
	            session.update(crossing);
	            transaction.commit();
	            result = 1; // Successful update
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }

	        return result;
	    }
		
		public RailwayCrossing getRailwayCrossingById(int crossingId) {
	        Session session = sf.openSession();
	        Transaction transaction = null;
	        RailwayCrossing crossing = null;
	        
	        try {
	            transaction = session.beginTransaction();
	            crossing = session.get(RailwayCrossing.class, crossingId);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return crossing;
	    }

public List<RailwayCrossing> searchCrossingByName(String crossingName) {
    try (Session session = sf.openSession()) {
        TypedQuery<RailwayCrossing> query = session.createQuery("from RailwayCrossing where name like :crossingName", RailwayCrossing.class);
        query.setParameter("crossingName", "%" + crossingName + "%");
        return query.getResultList();
    } catch (Exception e) {
        System.out.println(e);
        return null;
    }
}
}
