package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> arraylist = new ArrayList<>();
		
	
		
		arraylist.add("mumbai");
		arraylist.add("pune");
		arraylist.add("madurai");
		arraylist.add("chennai");
		arraylist.add("madurai");
		arraylist.add("madurai");
		
Set<String> setdemo = new HashSet<String>();
		
	
		
		setdemo.add("mumbai");
		setdemo.add("pune");
		setdemo.add("madurai");
		setdemo.add("chennai");
		setdemo.add("madurai");
		setdemo.add("madurai");
		
Map<Integer, String> zipcodes = new HashMap<>();
		
		// adding elements into map
		zipcodes.put(431405, "Nashik");
		zipcodes.put(40097, "Mumbai");
		zipcodes.put(40077, "Dhule");
		zipcodes.put(null, "Pcmc");

		System.out.println(Collections.frequency(setdemo, "madurai"));
	}

}
