package ems;

import p1.EmployeeClass;

public class Developer extends EmployeeClass {
	String progLang;
	
	Developer(int id,String name,int salary,String progLang){
		this.id = id;
		this.name=name;
		this.salary=salary;
		this.progLang=progLang;
	}
	
	
	
	@Override
	public void work() {
		System.out.println("Developer class work method"); 
	}

}
