package org.niit.demo.multithreading;

public class MyThreadInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=2000;i=i+5)
		{
			System.out.println(i);
		}
	}

	
	
}
