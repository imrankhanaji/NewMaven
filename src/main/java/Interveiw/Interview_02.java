package Interveiw;

public class Interview_02 {
	
	String name;
	int rollnumber;
	int marks;
	char gender;
	
	public static void main(String[] args) {
		
	Interview_02 interv=new Interview_02();
	
	interv.setStudentName("imran");
	String test=interv.getStudentName();
	System.out.println(test);
	method();
	

}
	public void setStudentName(String name) {
		
		this.name=name;
		
		
	}
	
	public String getStudentName() {
		
		
		return name;
	}
	
	public static void method() {
		System.out.println("test the static reference");
	}
	
	
}
