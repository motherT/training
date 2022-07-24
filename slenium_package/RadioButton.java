package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// In this code we are trying to perform click on radio button in form
// Locate the radio buttons
// Perform click on buttons and submit
	
public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		// Set the path of chromeDriver browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the chromeDriver browser
       		 WebDriver driver = new ChromeDriver();
		// pass the link of website 
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
	        // now we will save the locator of element in WebElement object .
	        //radio option female
	        WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@value='female']"));
		// radio option male
	        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@value='male']"));
		// radio option Other
	        WebElement radioButtonOther = driver.findElement(By.xpath("//input[@value='Other']"));
	        // submit button
	        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Send']"));
		
		// perform click on the element in webpage
	        radioButtonFemale.click();
		
		//Thread is a class in java used to hold a part of code for some given time using sleep method. 
	        Thread.sleep(6000);
	        radioButtonMale.click();
	        submitButton.click();
	}

}

Note - WebElement is only used for saving the locators value.
