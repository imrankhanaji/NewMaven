package NewMaven.NewMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWait_Concept_titl {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		//driver.get("https://app.hubspot.com/login");
		
		driver.get("https://amazon.in");
		
		//Selenium dependancy class printing "Checking browser"
		
		
		
		//WebDriverWait wait=new WebDriverWait(driver, 2); Hubspot login will take 5 seconds to load.
		// Timeout Exception
		//Expected condition failed: waiting for title to contain "HubSpot". 
		//Current title: "Checking browser" (tried for 2 second(s) with 500 milliseconds interval)
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("HubSpot"));
		// Exact title
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		//System.out.println(driver.getTitle());
		
		String title=doGetPageTitleWithContains(driver, 10, "Amazon");
		System.out.println(title);
		
		
	}

	public static String doGetPageTitleWithContains(WebDriver driver,int timeout, String title) {
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
		
	}
	
	public static String doGetPageTitleWithIstitle(WebDriver driver,int timeout, String title) {
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
	}
}
