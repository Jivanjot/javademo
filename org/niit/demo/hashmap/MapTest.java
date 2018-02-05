package org.niit.demo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<Integer,Employee> m=new HashMap();
		Employee e;
		e=new Employee(1,"jivan");
		m.put(1,e);
		e=new Employee(2,"manpreet");
		m.put(2,e);
		System.out.println(m.get(2));
		
	}

}
