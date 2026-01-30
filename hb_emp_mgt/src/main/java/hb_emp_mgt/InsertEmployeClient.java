package hb_emp_mgt;

import javax.security.auth.login.Configuration;

public class InsertEmployeClient {
	public static void main(String[] args) {
		System.out.println("Welcome");
		Employe e1 = new Employe(1, "Raj", "Dev", 7700.00);
		Configuration hbCnfg = new Configuration();
		hbCnfg.configure("hibernate.cfg.xml");
		hbCnfg.addAnnotatedClass(Employe.class);
		
	SessionFactory sf=	hbCnfg.b
		
		
		

	}

}
