package OOPS;


public class ConstConcept {
	
	 String name;
	
	public  ConstConcept(String name) {
		
		this.name=name;
		
		System.out.println("my constructor");
		
	}
	
	public static void main(String[] args) {
		
		
		
		ConstConcept cc=new ConstConcept("imran");
		
		System.out.println(cc.name);
		
		
		
		
	}

}
