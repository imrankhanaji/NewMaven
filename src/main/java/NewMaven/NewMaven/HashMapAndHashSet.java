package NewMaven.NewMaven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAndHashSet {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		
		set.add("imran");
		set.add("imran");
		
		System.out.println(set);
		//set.add("imran");
		//System.out.println(set);
		
		//Hashmap-- will use for multi-threading to improve the performance
		
		//Name=Imran, Location=Chennai, youtubechanel=cooking
		
		//1.  Hashmap is a class which implements Map Interface
		// Extends Abstract map
		//only contains unique values, duplicate value will be eliminated.
		
		// Stores the value in Key- valuepair
		// it may have one null key and multiple null values
		// it doesnot maintain order like Arraylist indexing.
		// Hashmap is non-synchronized. Hashtable is Synchronized, multiple thread cannot access simulteanously.
		// Fail fast condition T2 trying to access T1 value and its removed by T1 already. will get null pointer exception
		
//		Map<String, String>	map=new HashMap<String, String>();
//		
//		map.put("Name", "Imrankhan");
//		map.put("Name", "Imrankhan");
//		map.put("Location", "Chennai");
//		map.put("Youtubechanel", "Cooking");
//		
//		map.get("Name");
//		
		//map.remove("Location");
		
		//System.out.println(map.size());
		
		//System.out.println(map);
		
//--------------------------------Naveen------------------------------//
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		
		//HashMap<String, String> hm= new HashMap<String, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "UFT");
		hm.put(3, "LoadRunner");
		
		//System.out.println(hm.get(2));
		//System.out.println(hm.get(4));
		// M is the reference and entryset is the entire values on the map
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
	
	}
	
	
	
}
