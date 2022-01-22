package NewMaven.NewMaven;


public class Interview_Prepare {

	public static void main(String[] args) {
		
		String str="imran khan";
		
		//System.out.println(str.length()-1);
		
			String order="Your order number is 12345";
	     
			int ord=order.indexOf("is")+3;
	     
	     System.out.println(order.substring(ord, order.length() ));
	     System.out.println(order.substring(ord));
		
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('a')+1);
		
		String lang="Java-Python-Ruby-JavaScript";
		
		String [] h1=lang.split("-");
		
		//System.out.println(h1[1]);

		for(int i=0;i<h1.length-1;i++) {
			System.out.println(h1[i]);
			
		}
		
	}

}
