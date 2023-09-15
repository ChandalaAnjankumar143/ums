
package com.jsp.repository;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.DTO.ApplicationDto;
import com.jsp.Entity.ApplicationEntity;
import com.jsp.util.MysqlConnectionProperties;
import com.jsp.util.SessionfactoryUtil;

public class ApplicationRepository {

	public void saveOrUpdate(ApplicationEntity applicationEntity) {
//		Configuration con = new Configuration();
//		con.setProperties(MysqlConnectionProperties.getConnectionProperties());
//		con.addAnnotatedClass(ApplicationEntity.class);
//		SessionFactory sessionFactory = con.buildSessionFactory();
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(applicationEntity);
		transaction.commit();

	}

	public ApplicationEntity getById(long id) {
//     Configuration cfg = new Configuration();
//     cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
//     cfg.addAnnotatedClass(ApplicationEntity.class);
//     SessionFactory sessionFactory = cfg.buildSessionFactory();
       SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
       Session session = sessionfactory.openSession();
       return session.get(ApplicationEntity.class,id);
	}
	
	public void update(ApplicationDto applicationdto) {
		ApplicationEntity applicationEntity = getById(applicationdto.getAltKey());
		if(applicationEntity !=null) {
			 applicationEntity.setUsername(applicationdto.getUsername());;
			 applicationEntity.setPassword(applicationdto.getPassword());;
		     saveOrUpdate(applicationEntity);
//			 cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
//			 cfg.addAnnotatedClass(ApplicationEntity.class);
//			 SessionFactory sessionFactory = cfg.buildSessionFactory();
//			 Session session = sessionFactory.openSession();
//			 Transaction transaction = session.beginTransaction();
//			 session.merge(applicationdto);
//			 transaction.commit();
	}
	}
    public void delete(long id)
    {
    	   ApplicationEntity applicationEntity = getById(id);
    	   SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
    	   Session session = sessionfactory.openSession();
           Transaction transaction = session.beginTransaction();
           session.delete(applicationEntity);
           transaction.commit();
			
    }
}
