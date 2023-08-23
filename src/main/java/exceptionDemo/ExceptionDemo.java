package exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
	
	public ExceptionDemo()
	{
		//System.out.println("This strnig is "+s);
	}
	public ExceptionDemo(String s)
	{
		System.out.println("This strnig is "+s);
	}
	
	public void readFile(int div) 
	{
		
	 int a=16;
	 if(div==0)
	 {
		 throw new ArithmeticException();
		 
	 }
	 else if(div<0)
	 {
		 throw new ArithmeticException("Please enter positive number");
	 }
	 else
	 {
		 System.out.println("Division is "+a/div);
	 }
			  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo demo = new ExceptionDemo();
		ExceptionDemo demo1 = new ExceptionDemo("Java Session");
		
		demo.readFile(-1);
		
	}

}
