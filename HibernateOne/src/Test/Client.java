package Test;
import beans.Employee;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Client 
{	
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("Resources/HibernateOne.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
//		Session s = sf.openSession();
//		Transaction tx = s.beginTransaction();
//		
//		Employee EMP = new Employee();
//		EMP.setId(0);
//		EMP.setAddress("DELHI");
//		EMP.setName("SAHIL");
//		EMP.setSalary(1000000);
//		s.save(EMP);
//		tx.commit();
//		s.flush();
//		s.close();
	}
}
