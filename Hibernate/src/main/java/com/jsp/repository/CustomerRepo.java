package com.jsp.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.Entity.BankAccount;
import com.jsp.Entity.Customer;
import com.jsp.util.SessionfactoryUtil;

public class CustomerRepo {
	
	public static void saveCustomer(Customer customer)
	{
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(customer);
		transaction.commit();
	}

}
