package Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Student;
import Util.SessionfactoryUtil;


public class StudentRepository {

	public void saveStudent(List<Student>list) {
		SessionFactory sessionfactory = SessionfactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		for(Student c:list)
		{
			session.save(c);
		}
		transaction.commit();

	}
	
}
