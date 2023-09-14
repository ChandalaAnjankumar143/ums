package Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Customer;
import Util.SessionfactoryUtil;

public class BankRepository {

	public static void saveCustomer(Customer customer)
	{
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(customer);
		transaction.commit();
	}

}
