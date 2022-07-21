package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FormFillUp_Chrome {
	
	// In this code we are trying to pass the value in input box and click thesend button
	// Locate the element and pass the value to input box
	
	//Click the send button and submit the value
	
public static void main(String[] args) {
	
    // Create a object of WebDriver 
    WebDriver driver;
   // setProperty method is used to set the path of driver from system location
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
    // Create the object of the driver
    driver = new ChromeDriver();
    // opening website for form fill up
    driver.get("http://www.training.qaonlinetraining.com/testPage.php");
    
    // sending text to the input box in the web form--------------
    // Locate and filling the name section
    driver.findElement(By.name("name")).sendKeys("DemoName");
 
    //Locate and fill the  E mail section
    driver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
    
    //Locate and fill the  Website section
    driver.findElement(By.name("website")).sendKeys("www.demosite.com");
    
    // Locate and fill the Comment section
    driver.findElement(By.name("comment")).sendKeys("demo comment");
    
    //Locate and Click on Send Button
    driver.findElement(By.name("submit")).click();
   
}
}
