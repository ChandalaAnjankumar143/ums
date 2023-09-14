package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.BankAccount;
import Entity.Course;
import Entity.Customer;
import Entity.Student;

public class SessionfactoryUtil {
	private static SessionFactory sessionFactory=null;

	public static SessionFactory getSessionfactory() {
		
		 if(sessionFactory==null)
		    {
			 Configuration cfg = new Configuration();
		     cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
		     cfg.addAnnotatedClass(Customer.class);
		     cfg.addAnnotatedClass(BankAccount.class);
		     cfg.addAnnotatedClass(Student.class);
		     cfg.addAnnotatedClass(Course.class);
	
		      sessionFactory  = cfg.buildSessionFactory();
		    } 
		
		return sessionFactory;
	}

}
