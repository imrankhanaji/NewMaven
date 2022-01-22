package Interveiw;

public class Interview_01 {

	public static void main(String[] args) {
		
		String rev="imran khan";
		
		int rever=rev.length();
		
		String reverse="";
		
		System.out.println(rever);
		
		for(int i=rever-1;i>=0;i--) {
			
			
			reverse=reverse+rev.charAt(i);
			
			
		}
		System.out.println(reverse);
		
		//------------------------//
		
//		StringBuilder sc=new StringBuilder(rev);
//		
//		System.out.println(sc.reverse());;

	}

}
