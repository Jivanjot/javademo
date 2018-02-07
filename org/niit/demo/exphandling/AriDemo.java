package org.niit.demo.exphandling;

public class AriDemo {
	
	private float x,y;

	
	public  void display(int x,int y)
	{
		try{
      System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
			
		}
}
}