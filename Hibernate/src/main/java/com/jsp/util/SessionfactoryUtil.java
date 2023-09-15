package com.jsp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.Entity.ApplicationEntity;
import com.jsp.Entity.BankAccount;
import com.jsp.Entity.Customer;
import com.jsp.Entity.MovieEntity;
import com.jsp.Entity.RegisterationDetails;
import com.jsp.Entity.Veichel;

public class SessionfactoryUtil {
private static SessionFactory sessionFactory=null;

// public static SessionFactory  getSessionfactory()
// {
//   if(sessionFactory==null)
//    {
//	 Configuration cfg = new Configuration();
//     cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
//     cfg.addAnnotatedClass(ApplicationEntity.class);
//      sessionFactory  = cfg.buildSessionFactory();
//    }  
//	return sessionFactory;	
// }
 public static SessionFactory  getSessionfactory()
 {
   if(sessionFactory==null)
    {
	 Configuration cfg = new Configuration();
     cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
     cfg.addAnnotatedClass(MovieEntity.class);
     cfg.addAnnotatedClass(Customer.class);
     cfg.addAnnotatedClass(BankAccount.class);
     cfg.addAnnotatedClass(Veichel.class);
     cfg.addAnnotatedClass(RegisterationDetails.class);
     cfg.addAnnotatedClass(ApplicationEntity.class);
      sessionFactory  = cfg.buildSessionFactory();
    }  
	return sessionFactory;	
 }

 public static SessionFactory  getSessionfactoryToCustomer(Customer customer)
 {
   if(sessionFactory==null)
    {
	 Configuration cfg = new Configuration();
     cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
     cfg.addAnnotatedClass(Customer.class);
     cfg.addAnnotatedClass(BankAccount.class);
   //  cfg.addAnnotatedClass(RegisterationDetails.class);
      sessionFactory  = cfg.buildSessionFactory();
    }  
	return sessionFactory;	
 }
}
