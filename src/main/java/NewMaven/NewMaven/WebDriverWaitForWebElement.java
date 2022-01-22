package NewMaven.NewMaven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForWebElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		//driver.findElement(email).sendKeys("testnaveen@gmail.com");
		
		waitForElementPresent(driver, 10, email).sendKeys("test@gmail.com");
		
		driver.findElement(password).sendKeys("test123");
		
		waitForElementPresent(driver, 5, loginButton).click();


	}
	
	public static WebElement waitForElementPresent(WebDriver driver, int timeOut, By locator){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	

}
