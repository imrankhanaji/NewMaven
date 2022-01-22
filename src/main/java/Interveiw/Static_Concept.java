package Interveiw;

public class Static_Concept {

	public static void main(String[] args) {
		
		// Static array: will store same type of data. Homogenous type- to solve this will use object array
		
		
		int i[]=new int[4];
		
		 	i[0]=10;
		 	i[1]=20;
		 	i[2]=30;
		 	//i[3]=40;
		
		System.out.println(i[3]);
		
		//Asci value printing due to summation of chars with int
		int j='1';
		int z=2;
		
		System.out.println(j+z);
		
	 
		//System.out.println(i[4]); //Array index out of bound exception, beyond the limit.
		
		System.out.println(i.length);
		
		System.out.println(i[0]+i[3]);
		
		//print all the values of array
		
		for(int k=0;k<i.length;k++) {
			
			System.out.println(i[k]);
			
		}
		
		// String Array:
		
		String str[]=new String[3];
		
		str[0]="Java";
		str[1]="Python";
		//str[2]="VB";
		
		System.out.println(str[2]);
		
		
		for(int m=0;m<str.length;m++) {
			
			System.out.println(str[m]);
			
		}
		
		//Boolean Array
		
		boolean b[]=new boolean[1];
			
			b[0]=true;
			//b[1]=false;
			
			System.out.println(b[0]);
		
		
		//Object Array
		
		Object obj[]=new Object[5];
			
			obj[0]="Imran";
			obj[1]='M';
			obj[2]=10000;
			obj[3]="CTS";
			obj[4]="Insurance";
				
			for(int u=0;u<obj.length;u++) {
				
				System.out.println(obj[u]);		
				
			}
			
		//character array
		
			char c[]=new char[3];
				c[0]='M';
				c[1]='F';
				System.out.println(c[2]);
			
					
	}
}
