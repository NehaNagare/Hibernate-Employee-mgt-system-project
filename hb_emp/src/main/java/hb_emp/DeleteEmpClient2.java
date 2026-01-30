package hb_emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmpClient2 {

	public static void main(String[] args) {
		System.out.println("Welcome");

		Configuration hbCnfg = new Configuration();
		hbCnfg.configure("hibernate.cfg.xml");
		hbCnfg.addAnnotatedClass(Employe.class);

		SessionFactory sf = hbCnfg.buildSessionFactory();
		Session sessn = sf.openSession();

		Employe emp = sessn.get(Employe.class, 3);
		if(emp!=null) {
			sessn.delete(emp);
			System.out.println("Employee deleted successfully...");
		}else {
			System.out.println("Employe not found");
		}
		
		
       	sessn.beginTransaction().commit();
		System.out.println("*********Thank you*********");

	}
}
