package slenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// In this code we navigate to different website using navigate method

public class NavigateClass {

	public static void main(String[] args) {
		// set path of driver
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	      WebDriver  browserDriver = new ChromeDriver();
	        browserDriver.get("https://www.facebook.com/");
		// getTitle method will give me title in webpage
	        System.out.println("this is " + driver.getTitle() + " website");
		// getCurrentUrl method will give me url in webpage
	        System.out.println("url is: " + driver.getCurrentUrl());
	        // navigating to another site
	        browserDriver.navigate().to("http://www.instagram.com/");
	        System.out.println("this is " + driver.getTitle() + " website");
	        System.out.println("url is: " + driver.getCurrentUrl());
	        // navigating to another site
	        browserDriver.navigate().to("http://www.twitter.com/");
	        System.out.println("this is " + driver.getTitle() + " website");
	        System.out.println("url is: " + driver.getCurrentUrl());
	        // navigating back to gmail .com
	        browserDriver.navigate().back();
	        System.out.println("this is " + driver.getTitle() + " website");
	        System.out.println("url is: " + driver.getCurrentUrl());
	        // navigating back to google .com
	        browserDriver.navigate().back();
	        driver.navigate().forward();
	        System.out.println("this is " + driver.getTitle() + " website");
	        System.out.println("url is: " + driver.getCurrentUrl());
	        browserDriver.close();

	}

}
