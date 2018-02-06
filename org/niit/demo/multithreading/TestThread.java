package org.niit.demo.multithreading;

public class TestThread {

	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		t.start();
		for(int i=1001;i<=2000;i++)
		{
			System.out.println(i);
		}
	}
	
	
}
