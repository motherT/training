// In this script we are fetching the link in webpage 
// Steps to perform 
//1. setup the property of chromedriver because we will perform testing login form through chrome web browser.
//2. Initialize Webdriver object through ChromeDriver class.
//3. Open website link https://www.itlearn360.com/.
//4. Intialize value to variable to keep count of number of links in webpage 
//5. List all the tagName in one place.

package slenium_package;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
