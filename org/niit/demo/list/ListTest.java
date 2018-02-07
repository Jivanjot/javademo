package org.niit.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		List<Employee> e=new ArrayList();
		Employee emp;
		emp=new Employee(1,"jivan");
		e.add(emp);
		emp=new Employee(2,"manpreet");
		e.add(emp);
		emp=new Employee(3,"prabhjot");
		e.add(emp);
		
		emp.display(e);
		System.out.println(emp.search(e, 2));
		
	}

}
