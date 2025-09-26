package ems;
import java.util.*;

import p1.EmployeeClass;

public class Main {

	public static void main(String[] args) {
		
		List<EmployeeClass> empList = new ArrayList<>();
		empList.add(new Manager(1,"Divya",1000,23));
		empList.add(new Manager(3,"Hirdesh",10000,5));
		empList.add(new Developer(1,"pankaj",1000,".js"));
		empList.add(new Developer(2,"amit",4000,"java"));
		
		//polymorphism : work() depends on object 
		for (EmployeeClass e : empList) {
			e.work();  //runtime polymorphism
		}
		
		for(EmployeeClass e : empList) {
			if(e instanceof Manager) {
			int teamSize = ((Manager) e).teamSize;
			System.out.println(teamSize);
			}else if(e instanceof Developer){
				System.out.println(((Developer)e).progLang);
			}
		}
		
		
		
		
		
	}

}
