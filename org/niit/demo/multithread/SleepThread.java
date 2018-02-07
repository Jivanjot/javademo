package org.niit.demo.multithread;

public class SleepThread extends Thread {
	

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
