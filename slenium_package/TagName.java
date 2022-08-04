// In this script we are fetching the link in webpage 
// Steps to perform 
//1. setup the property of chromedriver because we will perform testing login form through chrome web browser.
//2. Initialize Webdriver object through ChromeDriver class.
//3. Open website link https://www.itlearn360.com/.
//4. Intialize value to variable to keep count of number of links in webpage 
//5. List all the tagName in one list.
//6. Now fetch the value inside the tagname using getAttribute method.To fetch value in sequence we will use for loop 
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

		 WebDriver browserDriver;
	       //1. setup the property of chromedriver because we will perform testing login form through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//2. Initialize Webdriver object through ChromeDriver class.
	        browserDriver = new ChromeDriver();
		//3. Open website link https://www.itlearn360.com/.
	     	 browserDriver.get("https://www.itlearn360.com/");
		//4. Intialize value to variable to keep count of number of links in webpage 
	        int count = 0;
	        
	        //5. List all the tagName in one list.
	        List<WebElement> allLinks = browserDriver.findElements(By.tagName("a"));
		
		//6. Now fetch the value inside the tagname using getAttribute method.To fetch value in sequence we will use for loop 
	        for (WebElement link : allLinks) {
	            // print the each url 
	            System.out.println(link.getAttribute("href"));
			// the number of link keep counting along with loop
	            count ++;
	            
	        }
		//7. Calculate number of links and print in all.
	        System.out.println("total number of links present: "+count);
		
		//8. Closing the driver using close method.
	        browserDriver.close();
	}

}
