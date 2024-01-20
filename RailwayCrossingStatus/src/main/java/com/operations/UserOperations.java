package com.operations;

import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.connections.HiberConfig;
import com.entity.Favorites;
import com.entity.RailwayCrossing;
import com.entity.User;

public class UserOperations {
    private SessionFactory sf = HiberConfig.GetConnection();


    public boolean validateUser(String email, String password) {
        try {
            Session session = sf.openSession();
            TypedQuery<User> query = session.createQuery("FROM User WHERE email = :email AND password = :password", User.class);
            query.setParameter("email", email);
            query.setParameter("password", password);

            List<User> userList = query.getResultList();

            return !userList.isEmpty(); 
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean createUser(String email, String password) {
        try (Session session = sf.openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            session.save(user);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Favorites> getFavorites(String userEmail) {
        try (Session session = sf.openSession()) {
            TypedQuery<User> userQuery = session.createQuery("from User where email=:userEmail", User.class);
            userQuery.setParameter("userEmail", userEmail);
            User user = userQuery.getSingleResult();

            List<Favorites> favorites = user.getFavorites();
            return favorites;
        } catch (Exception e) {
            System.out.println("Error retrieving favorites: " + e);
            return null;
        }
    }
    

    private User getUserByEmail(Session session, String email) {
        return session.createQuery("FROM User WHERE email = :email", User.class)
                      .setParameter("email", email)
                      .uniqueResult();
    }

    private RailwayCrossing getCrossingById(Session session, int crossingId) {
        return session.get(RailwayCrossing.class, crossingId);
    }

    }

