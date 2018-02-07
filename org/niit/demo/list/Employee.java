package org.niit.demo.list;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display(List<Employee> emp)
	{
		for(Employee var:emp)
		{
			System.out.print(var.getId()+"\t");
			System.out.println(var.getName());
		}
	}
	
	public String search(List<Employee> emp,int id)
	{
		for(Employee q:emp)
		{
			if(q.getId()==id)
			{
				return "exist";
			}
			
		}
		return "not Exist";
		
		
	}
	
	

}
