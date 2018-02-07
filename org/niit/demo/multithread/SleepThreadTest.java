package org.niit.demo.multithread;

public class SleepThreadTest {
	
	public static void main(String[] args) {
		
		SleepThread ti=new SleepThread();
		ti.start();
		
		for(int i=0;i<100;i++)
		{
			try {
			ti.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("jivan");
		}
	}

}

