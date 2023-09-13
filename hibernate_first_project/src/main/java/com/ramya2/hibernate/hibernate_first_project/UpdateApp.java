package com.ramya2.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.ramya2.entity.Student;
import com.ramya2.utils.HibernateUtils;

/**
 * Hello world!
 *
 */
public class UpdateApp 
{
    public static void main( String[] args )
    {	

    	
    	Session session=HibernateUtils.getSessionFactory();
    	Student stud=session.get(Student.class, 103);
    	stud.setsName("Ranjana");
    	stud.setBranch("AI & ML");
    	session.beginTransaction();
    	session.update(stud);
    	session.getTransaction().commit();
    	System.out.println(stud);
    	
    }
}