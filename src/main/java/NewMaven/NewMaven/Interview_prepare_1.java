package NewMaven.NewMaven;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Interview_prepare_1 {

	public static void main(String[] args) {
		
		//String Maniuplation
		String agmt="Agreement reference number  is 848484848484";
		
		int i=agmt.indexOf("is")+3;
		
		String st=agmt.substring(i);
		System.out.println(st);
		
		String longMsg="hi this is imran and working on selenium";
	     
	     System.out.println(longMsg.substring(0, 7));
	     
	     HashMap <Integer, String> hm=new HashMap <Integer, String>();
	     hm.put(1, "selenium");
	     hm.put(2, "uft");
	     hm.put(3, "loadrunner");
	     hm.put(4, "winnium");
	     hm.put(null, null);
	     System.out.println("----------------");
	     
	     for(Entry m:hm.entrySet()) {
	    	 System.out.println(m.getKey() + " "+ m.getValue());
	    	
	     }
	     
	     Hashtable<Integer,String> ht=new Hashtable <Integer,String>();
	     ht.put(1, "manual");
	     ht.put(2, "automation");
	     ht.put(3, "functional");
	     ht.put(4, "test");
	     ht.put(4, "test");
	    // System.out.println(ht);
	     
	     Enumeration <String> e=ht.elements();
	     
	     while(e.hasMoreElements()) {
	    	 
	    	 System.out.println(e.nextElement());
	    	 
	    	 System.out.println(e.hashCode());
	    	 
	    	 
	     }
	     
	     
	    
	     
	     

	}
	
	
	
	
	
	

}
