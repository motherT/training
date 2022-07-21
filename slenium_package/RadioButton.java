package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		// setProperty method is used to set the path of driver from system location
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the driver
       		 WebDriver driver = new ChromeDriver();
		
		// Using driver object call the get method and pass the website link
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
	        // now we will save the locator of element in WebElement object .
	        //radio option female
	        WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@value='female']"));
//	        radio option male
	        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@value='male']"));
//	        radio option Other
	        WebElement radioButtonOther = driver.findElement(By.xpath("//input[@value='Other']"));
	        // submit button
	        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Send']"));
		
		// perform click on the elements in webpage
	        radioButtonFemale.click();
	        Thread.sleep(6000);
	        radioButtonMale.click();
	        submitButton.click();
	}

}

Note - WebElement is only used for saving the locators only.
