package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arraylist = new ArrayList<>();
		
	
		
		arraylist.add("mumbai");
		arraylist.add("pune");
		arraylist.add("madurai");
		arraylist.add("chennai");
		arraylist.add("madurai");
		arraylist.add("madurai");
		
		System.out.println(arraylist);
		/*
		 * System.out.println(" before update "+arraylist);
		 * 
		 * arraylist.set(2, "parbhani");
		 * 
		 * System.out.println(" after update "+arraylist);
		 * 
		 * System.out.println("index of madurai "+arraylist.indexOf("madurai"));
		 * 
		 * boolean isVailable = arraylist.contains("nashik"); if(isVailable)
		 * System.out.println("nashik is available");
		 * 
		 * 
		 * System.out.println(" after remove operation "+arraylist);
		 */
		
		Iterator<String> it= arraylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println("using iterator "+it.next());
		}
		
		
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		

	}

}
