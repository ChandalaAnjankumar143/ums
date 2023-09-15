package com.jsp.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.Entity.ApplicationEntity;
import com.jsp.Entity.Veichel;
import com.jsp.util.SessionfactoryUtil;

public class VehicleRepository {

	public void saveOrUpdate(Veichel veichel) {
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(veichel);
		transaction.commit();
	}
}
