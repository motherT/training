// In this selenium code ,we will pass value to input text box in form and perform click on send button
// Steps to perform in form 
//1. setup the property of chromedriver because we will perform passing value to input box in form through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
// 4. Locate Name section using name locator and send values to the the section
// 5. Locate email section using name locator and send values to the the section
// 6. Locate website section using name locator and send values to the the section
// 7. Locate comment section using name locator and send values to the the section
// 8. Locate the submit button and perform click
// 9. Close the browser


package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillUp {
	
public static void main(String[] args) {
	
  
    WebDriver browserObject;
  //1. setup the property of chromedriver because we will perform passing value to input box in form through chrome web browser.
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
    // 2. Initialize Webdriver object through ChromeDriver class.
    browserObject = new ChromeDriver();
    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
    
    // sending text to the input box in the web form--------------
    // 4. Locate Name section using name locator and send values to the the section
    browserObject.findElement(By.name("name")).sendKeys("DemoName");
 
    // 5. Locate email section using name locator and send values to the the section
    browserObject.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
    
   // 6. Locate website section using name locator and send values to the the section
    browserObject.findElement(By.name("website")).sendKeys("www.demosite.com");
    
    // 7. Locate comment section using name locator and send values to the the section
    browserObject.findElement(By.name("comment")).sendKeys("demo comment");
    
   // 8. Locate the submit button and perform click
    browserObject.findElement(By.name("submit")).click();
   // 9. Close the browser
    browserObject.close();
}
}
