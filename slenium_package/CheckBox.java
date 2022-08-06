// In this selenium code ,we will perform click on the checkbox and send the checkbox value.
// Steps to perform in case of checkbox
// 1. setup the property of chromedriver to perform "checkbox testing" through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
// 4. Locate the boat checkbox button using xpath and store the value in  reference created that is checkboxBoat.
// 5. Locate the bike checkbox button using xpath and store the value in  reference created that is checkboxBike. 
// 6. Locate the car checkbox button using xpath and store the value in  reference created that is checkboxCar. 
 // 7. Locate the horse checkbox button using xpath and store the value in  reference created that is checkboxHorse.
// 8. Locate the submit checkbox button using xpath and store the value in  reference created that is submitButton.
// 9. Perform click on boat button 
// 10. Perform click on bike button
// 11. Perform click on horse button 
// 12. Perform click on send button
// 13. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 14. Close the web browser
package slenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
	// 1. setup the property of chromedriver because we will perform "checkbox testing" through chrome web browser.
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 2. Initialize Webdriver object through ChromeDriver class.
        WebDriver browserObject = new ChromeDriver();
	// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	// 4. Locate the boat checkbox button using xpath and store the value in  reference created that is checkboxBoat.
	WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
	// 5. Locate the bike checkbox button using xpath and store the value in  reference created that is checkboxBike. 
      WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
    	// 6. Locate the car checkbox button using xpath and store the value in  reference created that is checkboxCar.
      WebElement checkboxCar = browserObject.findElement(By.xpath("//input[@value='car']")); // selected by-default
      // 7. Locate the horse checkbox button using xpath and store the value in  reference created that is checkboxHorse.
      WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
      // 8. Locate the submit checkbox button using xpath and store the value in  reference created that is submitButton.
      WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
      // selecting all options except car- selected by-default .The car element is clicked by default and value .So no need to perform click on the car element
     // 9. Perform click on boat button 
      checkboxBoat.click();
      // 10. Perform click on bike button
      checkboxBike.click();
      // 11. Perform click on horse button 
      checkboxHorse.click();
      System.out.println("wait 3 seconds and submit and close");
      // 12. Perform click on send button
      submitButton.click();
	
      // 13. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
      Thread.sleep(3000);
      // 14. Close the web browser
      browserObject.close();
	}

}
