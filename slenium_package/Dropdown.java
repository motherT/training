package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// In this code we are trying to perform click on dropdown in form
// In case of Dropdown we use Select class
// Select the elements and make text visible and submit
public class Dropdown {

	public static void main(String[] args) {
		// setProperty method is used to set the path of driver from system location
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// Intialize value to the driver
        	WebDriver driver = new ChromeDriver();
		// Using driver object call the get method and pass the website link
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
		
		// Use the select class in case of dropdown and locate the dropdown element and pass the locator in constructor
	        Select countrySelect = new Select(driver.findElement(By.name("country")));
	        
		// using the select object call selectByVisibleText method and select the text in dropdown
	        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
	        //or
	        countrySelect.selectByVisibleText("France");
	        
	        //Same explanation for skill dropdown
	        Select skillSelect = new Select(driver.findElement(By.name("skill")));
	        //using skillSelect to select menu options -- Programming
	        skillSelect.selectByVisibleText("Programming");
	        System.out.println("selectByVisibleText(\"Programming");
	        //OR
	        //using skillSelect to select menu options -- Database
	        skillSelect.selectByVisibleText("Database");
	        System.out.println("selectByVisibleText(\"Database");
	        
	        //Click on Send Button
	        driver.findElement(By.name("submit")).click();
	        System.out.println("Form Fill-up Succesfull");
	        driver.quit();
	}

}
