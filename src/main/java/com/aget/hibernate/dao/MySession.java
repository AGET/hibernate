package com.aget.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySession {
private Session session;
	public MySession() {
		super();
		// TODO Auto-generated constructor stub
        Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory  sessionFactory = configuration.buildSessionFactory();
         session = sessionFactory.openSession();
         session.beginTransaction();
	}

	public Session getSession() {
	        return session;
	}
}
