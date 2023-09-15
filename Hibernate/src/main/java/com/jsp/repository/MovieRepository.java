package com.jsp.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.Entity.MovieEntity;
import com.jsp.util.SessionfactoryUtil;

public class MovieRepository {
public void saveOrUpdate(MovieEntity movieentity) {
	SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
	Session session = sessionfactory.openSession();
	Transaction transaction = session.beginTransaction();
	transaction.commit();
}
public void findMovieById() {
	SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
	Session session = sessionfactory.openSession();
	
}
public void updateMovieDetails() {
	
}
}
