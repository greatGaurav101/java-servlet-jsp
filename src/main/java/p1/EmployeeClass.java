package p1;

public class EmployeeClass {
	
	protected int id;
	protected String name;
	protected int salary;
	
	public int getSalary() {
		return salary;
	}	
	
	public String getName() {
		return name;
	}

	public void work() {
		System.out.println("base class work method");
	}	
	

}
