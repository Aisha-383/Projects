package com.connections;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.entity.*;

public class HiberConfig {

	public static SessionFactory GetConnection()
	{
		Configuration configuration=new Configuration();
		Properties properties=new Properties();

		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/railway_crossing");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.FORMAT_SQL,true); 
		
		//properties.put(Environment.FORMAT_SQL, true);
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(admin.class);
		configuration.addAnnotatedClass(RailwayCrossing.class);
		configuration.addAnnotatedClass(Favorites.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		return sessionFactory;
	}
}
