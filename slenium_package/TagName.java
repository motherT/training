// In this script we are fetching all the link from webpage 
// Steps to perform 
//1. setup the property of chromedriver to fetch the webpage link through chrome web browser.
//2. Initialize Webdriver object through ChromeDriver class.
//3. Open website link https://www.itlearn360.com/.
//4. Intialize value to variable to keep count of number of links in webpage 
//5. List all the tagName in one list.
//6. Now fetch the value inside the List using getAttribute method.To fetch value in sequence we will use for loop 
//7. Calculate number of links and print in all.
//8. Closing the driver using close method.

package slenium_package;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {

		 WebDriver browserObject;
	       //1. setup the property of chromedriver to fetch the webpage link through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//2. Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
		//3. Open website link https://www.itlearn360.com/.
	     	 browserObject.get("https://www.itlearn360.com/");
		//4. Intialize value to variable to keep count of number of links in webpage 
	        int count = 0;
	        
	        //5. List all the tagName in one object.
	        List<WebElement> allLinks = browserObject.findElements(By.tagName("a"));
		
		//6. Now fetch the value from the List using getAttribute method.To fetch value in sequence we will use for loop 
	        for (WebElement link : allLinks) {
	          
	            System.out.println(link.getAttribute("href"));
	            count ++;
	            
	        }
		//7. Calculate number of links and print in all.
	        System.out.println("total number of links present: "+count);
		
		//8. Closing the driver using close method.
	        browserObject.close();
	}

}
