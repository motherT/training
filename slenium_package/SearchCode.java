package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCode {

	public static void main(String[] args) {
		// set the path of driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// pass the value to search in search button
		driver.findElement(By.name("q")).sendKeys("Selenium python");
		driver.findElement(By.name("btnK")).submit();
	}

}
