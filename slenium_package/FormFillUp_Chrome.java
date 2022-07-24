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
  // Set the path of driver
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
    // Create the object of the chromeBrowser driver
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
