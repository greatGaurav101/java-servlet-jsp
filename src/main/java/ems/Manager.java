package ems;

import p1.EmployeeClass;

public class Manager extends EmployeeClass{
	int teamSize;
	
	public Manager(int id,String name,int salary,int teamSize) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.teamSize=teamSize;		
	}


	@Override               
	public void work() {
		System.out.println("Manager class work method"); // changing the implementation
	}

}
