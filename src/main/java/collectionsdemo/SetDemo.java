package collectionsdemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> setdemo = new HashSet<String>();
		
	
		
		setdemo.add("mumbai");
		setdemo.add("pune");
		setdemo.add("madurai");
		setdemo.add("chennai");
		setdemo.add("madurai");
		setdemo.add("madurai");
		
		
		
		
		  System.out.println(" before update "+setdemo);
		 // setdemo.
		
		  
		  boolean isVailable = setdemo.contains("pune"); if(isVailable)
		  System.out.println("pune is available");
		  
		  
		  System.out.println(" after remove operation "+setdemo);
		 
	}

}
