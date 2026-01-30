package hb_emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmpClient {

	public static void main(String[] args) {
		System.out.println("Welcome");

		Configuration hbCnfg = new Configuration();
		hbCnfg.configure("hibernate.cfg.xml");
		hbCnfg.addAnnotatedClass(Employe.class);

		SessionFactory sf = hbCnfg.buildSessionFactory();
		Session sessn = sf.openSession();

		Employe emp = sessn.get(Employe.class, 1);
		if(emp!=null) {
			emp.setName("Ravi");
			emp.setSalary(50000.00);
			sessn.update(emp);
			System.out.println("Employee update successfully...");
		}else {
			System.out.println("Employe not found");
		}
		
		
       	sessn.beginTransaction().commit();
		System.out.println("Employe Details:");
		System.out.println(emp);
		System.out.println("*********Thank you*********");

	}
}
