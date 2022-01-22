package TestNG_Sessions;

public class TestNG_Annotations {
	
	//BS
	//BT
	//BC
	//BM-- Each and every tc will be executed
	
		//T1
	
	//AM
	
	//AC
	//AT
	//AS
	
	//@BeforeSuite
	
	//-------------------------------------------------//
	
	// @Test(dependsOnMethods="loginTest")
	// below method will be executed once login test pass if it fails tc wont run rest of the method will be skipped.
	
	
	
	public void homePage() {
		System.out.println("home page method");
	}
	
	// priority and Non-priority. TestNG will pick non-prior first with alphabet order and priority case we can make
	// it as 0, -- int ( 0 ) bcos @test retruns 0 numeric value we can pass -1, -5 also
	// if we gave same priority then it will pick in alphabet order only.

}
