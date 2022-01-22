import java.util.List;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	//WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.getInstance(SafariDriver.class).setup();
		
		
		//System.setProperty("Webdriver.chromedriver", "C:/Users/Imran Khan/Downloads/chromedriver_win32/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(90000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		//1. create a generic method to select the single from the list
		//2. capture all the suggestions in a list and return
		//3. http://automationpractice.com/index.php
		
		List<WebElement> suggestionsList = driver.findElements(By.xpath("//ul[@class='erkvQe']/li//span"));
		System.out.println(suggestionsList.size());
		
		for(int i=0; i<suggestionsList.size(); i++){
			if(suggestionsList.get(i).getText().equals("selenium python")){
				suggestionsList.get(i).click();
				break;
			}
		}
		
		
	}
	

}
