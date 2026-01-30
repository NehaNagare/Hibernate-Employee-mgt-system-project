package hb_emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertEmpClient {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		Employe e1=new Employe(5,"Radha","Dev",60000.00);
		Configuration hbCnfg=new Configuration();
		hbCnfg.configure("hibernate.cfg.xml");
		hbCnfg.addAnnotatedClass(Employe.class);
		
		SessionFactory sf = hbCnfg.buildSessionFactory();
		Session sessn=sf.openSession();
		sessn.save(e1);
		System.out.println("Emp is ready to insert .........");
		sessn.beginTransaction().commit();
		System.out.println("Now Emp inserted successfully.....");
		
		System.out.println("*********Thank you*********");
		
		
		
		
	}		
}
