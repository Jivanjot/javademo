package org.niit.demo.readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	public void readfile(String source)
	{
		FileInputStream f1=null;
		try {
		 f1=new FileInputStream(source);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int b=0;
		try {
			while((b=f1.read())>0)
			{
				System.out.print(Character.toChars(b));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				f1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
