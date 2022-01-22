package NewMaven.NewMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {
	
	static String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	
	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {

			
			//Windows:
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();//launch browser
			
			driver.get("http://www.amazon.com");//enter url
			
			String actualTitle = driver.getTitle();//get the page title
			System.out.println("page title is: " + actualTitle);
			
			//verification point: checkpoint: expected vs actual result : Assertions
			if(actualTitle.equals(expectedTitle)){
				System.out.println("correct title");
			}
			else{
				System.out.println("incorrect title");
			}
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if(url.contains("amazon")){
				System.out.println("correct url");
			}
			
			//System.out.println(driver.getPageSource());
			
			Thread.sleep(3000);
			driver.quit();//close the browser
			
		}

	}

	


