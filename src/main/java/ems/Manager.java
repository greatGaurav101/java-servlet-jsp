package ems;

import p1.EmployeeClass;

public class Manager extends EmployeeClass{
	int teamSize;
	
	public Manager(int id,String name,int salary,int teamSize) {
		
	}
	
	
	
	@Override               
	public void work() {
		System.out.println("Manager class work method"); // changing the implementation
	}

}
