// In this selenium code ,we will perform click on the radiobutton and send the radio value.
// Steps to perform in case of radio button
// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
// 4. Get the reference of female button by locating using xpath 
// 5. Get the reference of male button by locating using xpath 
// 6. Get the reference of other button by locating using xpath 
// 7. Get the reference of submit button by locating using xpath
// 8. Perform click on female button 
// 9. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 10. Perform click on male button 
//11. Perform click on send button
Note - In case of radio button the last clicked button value will pass.

package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserDriver = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
	        // now we will save the locator of element in WebElement object .
	        // 4. Get the reference of female button by locating using xpath 
	        WebElement radioButtonFemale = browserDriver.findElement(By.xpath("//input[@value='female']"));
		// 5. Get the reference of male button by locating using xpath
	        WebElement radioButtonMale = browserDriver.findElement(By.xpath("//input[@value='male']"));
		// 6. Get the reference of other button by locating using xpath
	        WebElement radioButtonOther = browserDriver.findElement(By.xpath("//input[@value='Other']"));
	        // 7. Get the reference of submit button by locating using xpath
	        WebElement submitButton = browserDriver.findElement(By.xpath("//input[@value='Send']"));
		
		// 8. Perform click on female button 
	        radioButtonFemale.click();
		
		// 9. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method 
	        Thread.sleep(6000);
		// 10. Perform click on male button 
	        radioButtonMale.click();
		//11. Perform click on send button
	        submitButton.click();
	}

}


