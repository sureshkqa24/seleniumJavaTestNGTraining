package collectionsdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> zipcodes = new HashMap<>();
		
		// adding elements into map
		zipcodes.put(431405, "Nashik");
		zipcodes.put(40097, "Mumbai");
		zipcodes.put(40077, "Dhule");
		zipcodes.put(null, "Pcmc");
		
		
		//System.out.println(zipcodes.get(40077));
		
		for(Map.Entry<Integer, String> e : zipcodes.entrySet())
		{
			System.out.println("Key is "+e.getKey());
			System.out.println("value is "+e.getValue());
		}
		
		
		
		for(Integer key : zipcodes.keySet())
		{
			//System.out.println("Key is "+e.getKey());
			System.out.println("value is "+zipcodes.get(key));
		}
		
		for(String key : zipcodes.values())
		{
			//System.out.println("Key is "+e.getKey());
			System.out.println("value is "+key);
		}
		
		
		

	}

}
