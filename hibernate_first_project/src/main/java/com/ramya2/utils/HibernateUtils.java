package com.ramya2.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya2.entity.Student;

public class HibernateUtils {
	public static Session getSessionFactory() {
		Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Student.class);
    	SessionFactory sessionfactory=configuration.buildSessionFactory();
    	Session session=sessionfactory.openSession();
		return session;
	}
}