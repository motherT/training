package slenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	// In this code we are trying to fetch all the links in webpage 
	// Locate the elements using tag name 
	// Fetch the link details from <a> tag and display in output 
	//Count the number of link avialable in webpage 
	public static void main(String[] args) {

		 WebDriver browserDriver;
	        // Set the path of chromeDriver browser
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// Intialize value to the chromeDriver browser
	        browserDriver = new ChromeDriver();
		// pass the link of website
	     	 browserDriver.get("https://www.itlearn360.com/");
	        int count = 0;
	        // Counting links of itlearn360 site , located by tagName
	        // FindElements is used to get mutiple elements 
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
