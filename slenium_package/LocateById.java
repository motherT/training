package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.itlearn360.com/");
        
//        driver.findElement(By.id("search_course")).sendKeys("Java for Automation");
        driver.findElement(By.name("search_course")).sendKeys("Java for Automation");

	}

}
