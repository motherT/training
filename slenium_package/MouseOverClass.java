package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// In this code we trying to perform mouse over that means we are trying to move our mouse to element and get the details 
 

public class MouseOverClass {

	public static void main(String[] args) {
		// Set the path of chromeDriver browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the chromeDriver browser
		ChromeDriver browserDriver = new ChromeDriver();
		
		// pass the link of website
		 browserDriver.get("https://www.amazon.com/");
	        //Thread.sleep(3000);
	        WebElement element = browserDriver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")) ;
	        
	        // Action class - action object -- passing driver information as parameter
	        Actions action = new Actions(browserDriver);
	        System.out.println("Mouse is over the - HELLO, SIGN IN - option");
	        
	        // moveToElement is the method() of class Action
	        action.moveToElement(element).build().perform();
	        //Thread.sleep(3000);
	        browserDriver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
	        System.out.println("Clicked");

	}

}
