package hb_emp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employe {


	@Id //primarykey
	int eid;
	String name;
	String role;
	double salary;
	public Employe() {
		super();
		System.out.println("Employe Object is created.......");
	}
	public Employe(int eid, String name, String role, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
