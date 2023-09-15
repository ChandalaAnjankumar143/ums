
package com.jsp.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.Entity.ApplicationEntity;
import com.jsp.util.SessionfactoryUtil;

public class Apphqlrepository {

	public List<ApplicationEntity> findAll() {
//String hqlQuery="from ApplicationEntity";
		StringBuilder builder = new StringBuilder();
		builder.append("from ApplicationEntity");
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(builder.toString());
		return query.getResultList();
	}

	public ApplicationEntity findByApplicationId(String applicationName) {
		StringBuilder builder = new StringBuilder();
		builder.append("from ApplicationEntity where ");
		builder.append(" applicationName=:n");// to give dynamic value
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(builder.toString());
		// return query.uniqueResult();
		query.setParameter("n", applicationName);
		// query.getResultList();
		return (ApplicationEntity) query.uniqueResult();
	}

	public void updateUrlByAppName(String url, String appName) {
		StringBuilder builder = new StringBuilder();
		builder.append("from applicationEntity set ");
		builder.append(" url=:u where applicationName=:appName ");// to give dynamic value
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("appName", appName);
		query.setParameter("u", url);
		query.executeUpdate();
		transaction.commit();
	}

}
