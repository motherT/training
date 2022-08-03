package slenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// In this code we are trying to fetch all the links in webpage and count the links in all
// Locate all the elements with link using tagName locator
// Fetch the link details from <a> tag and display in output and also count the number of links.

public class TagName {
	public static void main(String[] args) {

		 WebDriver browserDriver;
	        // Set the path of chromeDriver browser
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// Create the reference of the chromedriver browser
	        browserDriver = new ChromeDriver();
		// get method helps to load the web pages in the browser that we pass in a given parameter.
	     	 browserDriver.get("https://www.itlearn360.com/");
		// Intialize value to a variable 
	        int count = 0;
	        
	        // FindElements is used to get multiple elements 
	        List<WebElement> allLinks = browserDriver.findElements(By.tagName("a"));
	        for (WebElement link : allLinks) {
	            // print the each url 
	            System.out.println(link.getAttribute("href"));
			// the number of link keep counting along with loop
	            count ++;
	            
	        }
		// Print the total numbers of links
	        System.out.println("total number of links present: "+count);
		
		// close the driver
	        browserDriver.close();
	}

}
