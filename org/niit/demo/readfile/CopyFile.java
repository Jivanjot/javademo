package org.niit.demo.readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	

	public void copy(String source,String destination)
	{
	FileInputStream f1=null;
	FileOutputStream o1=null;
	
	try {
		f1=new FileInputStream(source);
		o1=new FileOutputStream(destination);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	int b=0;
	try {
		while((b=f1.read())>0);
		{
			o1.write(b);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			f1.close();
			o1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}
}
