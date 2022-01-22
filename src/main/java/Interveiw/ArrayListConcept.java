package Interveiw;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList () ;
		
		//duplicate values are allowed in ArrayList and more null value also
		ar.add("imran");
		ar.add(100);
		ar.add(100.22);
		//ar.add('A');
		ar.add(null);
		ar.add(null);
		ar.add(null);
		//ar.remove(3);
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		System.out.println("--------------------");
		
		ArrayList<String> studentsName=new ArrayList<String>();
		
		studentsName.add("Imran");
		studentsName.add("Suresh");
		studentsName.add("Ismail");
		
		for(String s:studentsName) {
			
			System.out.println(s);
		}
		
		
		ArrayList<Integer> marks=new  ArrayList<Integer>();
		
		marks.add(100);
		marks.add(200);
		marks.add(300);
		
		for(Integer s:marks) {
			
			System.out.println(s);
			
		}
		
	}

}
