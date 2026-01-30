package hb_emp_mgt;

public class Employe {

	@Id //primarykey
	int eid;
	String name;
	String role;
	double salary;
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	public Employe(int eid, String name, String role, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public Employe() {
		super();
		System.out.println("Employe() object is created............");
	}
	
	
}
