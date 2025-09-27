package ems;
import java.util.*;
import java.util.stream.Collectors;

import p1.EmployeeClass;

public class Main {

	public static void main(String[] args) {
		
		List<EmployeeClass> empList = new ArrayList<>();
		empList.add(new Manager(1,"Divya",1000,23));
		empList.add(new Manager(3,"Hirdesh",100000,5));
		empList.add(new Developer(1,"pankaj",5000,".js"));
		empList.add(new Developer(2,"amit",14000,"java"));
		
		//polymorphism : work() depends on object 
		for (EmployeeClass e : empList) {
			e.work();  //runtime polymorphism
		}
		
		for(EmployeeClass e : empList) {
			if(e instanceof Manager) {
			int teamSize = ((Manager) e).teamSize;
			System.out.println(teamSize);
			}
			else if(e instanceof Developer){
				System.out.println(((Developer)e).progLang);
			}
		}
		
		
		//finding the employee with salary>=10000;
		empList.stream()
		           .filter(e-> e.getSalary()>=15000)
		               .forEach(n-> System.out.println(n.getName()));
		
		//get the name of highest paid employee
		Optional<EmployeeClass> max = empList.stream()
					.max(Comparator.comparingInt(e->e.getSalary()));	
		
		max.ifPresent(e -> System.out.println(e.getName() + " : " + e.getSalary()));
		
		
	}

}
