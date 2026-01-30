package hb_emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectEmpClient {

	public static void main(String[] args) {
		System.out.println("Welcome");

		Configuration hbCnfg = new Configuration();
		hbCnfg.configure("hibernate.cfg.xml");
		hbCnfg.addAnnotatedClass(Employe.class);

		SessionFactory sf = hbCnfg.buildSessionFactory();
		Session sessn = sf.openSession();

		Employe emp = sessn.get(Employe.class, 1);
		Employe emp1 = sessn.get(Employe.class, 2);

		// no need to commit
//		sessn.beginTransaction().commit();
		System.out.println("Employe Details:");
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println("*********Thank you*********");

	}
}
