package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMedia {

	public static void main(String[] args) {
		// path of driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        ChromeDriver browserDriver=new ChromeDriver();
        driver.get("https://www.itlearn360.com/");
	// Locate the icons on webpage using className locator and perform click and we can navigate to different icons using navigate method 
        browserDriver.findElement(By.className("fa-facebook")).click();
        browserDriver.navigate().back();
        browserDriver.findElement(By.className("fa-twitter")).click();
        browserDriver.navigate().back();
        browserDriver.findElement(By.className("fa-instagram")).click();
        browserDriver.navigate().back();
        browserDriver.findElement(By.className("fa-youtube")).click();
        browserDriver.navigate().back();
        browserDriver.findElement(By.className("fa-linkedin")).click();
        browserDriver.navigate().back();
        
        browserDriver.close();

	}

}
