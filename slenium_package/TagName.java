package slenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;
	        // for running in Chrome, uncomment 2 following lines
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	        driver = new ChromeDriver();
//	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//	        driver = new FirefoxDriver();
	        
	        driver.get("https://www.itlearn360.com/");
	        int count = 0;
	        // Counting links of google site , located by tagName
	        // using Findelements
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	        for (WebElement link : allLinks) {
	            // print the each url 
	            System.out.println(link.getAttribute("href"));
	            count ++;
	            
	        }
	        System.out.println("total number of links present: "+count);
	        driver.close();
	}

}
