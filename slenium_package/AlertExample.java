package slenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// In this code we are trying to see different types of alert avialable in webpage 
// Test each alert button one by one and see the output 


public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// Set the path of chromeDriver browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the chromeDriver browser
		ChromeDriver browserDriver = new ChromeDriver();
		
		// pass the link of website
	        browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
	        
		// Locate the alert button and perform click 
	        browserDriver.findElement(By.id("alert")).click();
		// Use Alert class in case of alert and to switch from webpage to alert box call switchTo() and alert()
	        Alert alert = browserDriver.switchTo().alert();
		
		// to get the text from the alert box use getText()
	        System.out.println(alert.getText());
	        Thread.sleep(6000);
		
		// to accept the alert use accept()
	        alert.accept();
	        
	        // example 2 - dismiss(You pressed Cancel!)
		//The example is same to 1st one here we cancel the alert so we use dismiss()
	        browserDriver.findElement(By.id("confirm")).click();
	        Alert alert1 = browserDriver.switchTo().alert();
	        System.out.println(alert1.getText());
	        Thread.sleep(6000);
	        alert1.dismiss();
	        
	        // example 3 - accept and Type(Hello Mr. Bond! How are you today?)
		// In this example we are trying to send value to the input box inside alert 
	        browserDriver.findElement(By.id("prompt")).click();
	        Alert alert2 = browserDriver.switchTo().alert();
	        System.out.println(alert2.getText());
	        Thread.sleep(6000);
		// Use sendkeys() to send value to input box in alert box
	        alert2.sendKeys("Mr. Bond");
	        alert2.accept();
	}

}
