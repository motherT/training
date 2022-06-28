package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
	        Select countrySelect = new Select(driver.findElement(By.name("country")));
	        
	        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
	        //or
	        countrySelect.selectByVisibleText("France");
	        
	        //Select Option for skill menu
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
