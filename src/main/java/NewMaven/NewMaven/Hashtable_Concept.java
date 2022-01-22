package NewMaven.NewMaven;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_Concept {

	public static void main(String[] args) {
		
		// It is similar to HashMap, but it is Synchronized(Sequential)
		// Stores the value on the basis of Key- value pair
		// key- object- Hashcode- value (32 bit)
		// null value not allowed in Hash table
		
		Hashtable<Integer, String> ht=new Hashtable <Integer, String>();
		
		ht.put(1, "selenium");
		ht.put(2, "loadrunner");
		ht.put(3, "uft");
		ht.put(4, "Appium");
		
		 //System.out.println(ht.get(1));
		System.out.println(ht.hashCode());
		
		Enumeration<String> e=ht.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		 
		 
		

	}

}
