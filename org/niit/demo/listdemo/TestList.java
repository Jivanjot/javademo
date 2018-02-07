package org.niit.demo.listdemo;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList();
		mylist.add(10);
		mylist.add(100);
		mylist.add(1000);
		mylist.add(2,45);
		mylist.clear();
		mylist.add(466);
		
		 ListDemo d=new ListDemo();
	      d.listDisplay(mylist);
		
	}
	
	
	
}
