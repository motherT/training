package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// In this code we are trying to pass the value in input box and click the send button
// Locate the element and pass the value to input box
//Click the send button and submit the value

public class FormFillUp_Chrome {
	
public static void main(String[] args) {
	
    // In WebDriver we can intialize value of all drivers.So we can say WebDriver is universal class inside which all browser are defined.
    WebDriver driver;
  // Set the path of chromeDriver browser
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
    // Create the object of the chromeBrowser driver
    driver = new ChromeDriver();
    // opening website for form fill up
    driver.get("http://www.training.qaonlinetraining.com/testPage.php");
    
    // sending text to the input box in the web form--------------
    // Locate the element using name locator  and pass  the value to the name section using sendKeys method
    driver.findElement(By.name("name")).sendKeys("DemoName");
 
    //Locate the element using name locator  and pass  the value to  E mail section using sendKeys method 
    driver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
    
    //Locate the element using name locator  and pass  the value to  Website section using sendKeys method
    driver.findElement(By.name("website")).sendKeys("www.demosite.com");
    
    ///Locate the element using name locator  and pass  the value to  Comment section using sendKeys method
    driver.findElement(By.name("comment")).sendKeys("demo comment");
    
   ///Locate the element using name locator  and perform click on submit button
    driver.findElement(By.name("submit")).click();
   
}
}
