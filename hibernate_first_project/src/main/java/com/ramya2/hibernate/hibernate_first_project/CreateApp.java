package com.ramya2.hibernate.hibernate_first_project;


import org.hibernate.Session;
import com.ramya2.entity.Student;
import com.ramya2.utils.HibernateUtils;

/**
 * Hello world!
 *
 */
public class CreateApp 
{
    public static void main( String[] args )
    {	
    
    	 
    	Session session=HibernateUtils.getSessionFactory();
    	
    	Student student1=new Student();
    	student1.setsId(103);
    	student1.setsName("Vik");
    	student1.setBranch("ME");
    	session.beginTransaction();
    	session.persist(student1);
    	session.getTransaction().commit();
    	System.out.println("Student record saved");
    }

	
}