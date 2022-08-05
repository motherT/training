//In this code we are trying to perform navigation. 
// Steps to perform
// 1. setup the property of chromedriver to perform navigate through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page https://www.facebook.com/
// 4. In the print line we are uing getTitle method .This will give the title of current page
// 5. In next line we are using getCurrentUrl method .This will give the current url of the webpage
// 6. Using the navigate method we navigate to next webite http://www.instagram.com/
// 7. In the print line we are uing getTitle method .This will give the title of current page
// 8. In next line we are using getCurrentUrl method .This will give the current url of the webpage
// 9. Using navigate method we again navigate to next website http://www.twitter.com/
// 10. Now we use back method along with navigate method to get back to the last visited website 
// 11. Now we use back method again to navigate 
// 12. Now we use forward method to navigate forward
// 13. Close the browser
package slenium_package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		// 1. setup the property of chromedriver because we will perform testing of Mouse Over operation through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      WebDriver  browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	        browserObject.get("https://www.facebook.com/");
		// 4. In the print line we are uing getTitle method .This will give the title of current page
	        System.out.println("this is " + browserObject.getTitle() + " website");
		// 5. In next line we are using getCurrentUrl method .This will give the current url of the webpage
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	       // 6. Using the navigate method we navigate to next webite http://www.instagram.com/
	        browserObject.navigate().to("http://www.instagram.com/");
		// 7. In the print line we are uing getTitle method .This will give the title of current page
	        System.out.println("this is " + browserObject.getTitle() + " website");
		// 8. In next line we are using getCurrentUrl method .This will give the current url of the webpage
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	       // 9. Using navigate method we again navigate to next website http://www.twitter.com/
	        browserObject.navigate().to("http://www.twitter.com/");
	        System.out.println("this is " + browserObject.getTitle() + " website");
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	        // 10. Now we use back method along with navigate method to get back to the last visited website 
	        browserObject.navigate().back();
	        System.out.println("this is " + browserObject.getTitle() + " website");
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	        // 11. Now we use back method again to navigate 
	        browserObject.navigate().back();
		// 12. Now we use forward method to navigate forward
	        browserObject.navigate().forward();
	        System.out.println("this is " + browserObject.getTitle() + " website");
	        System.out.println("url is: " + browserObject.getCurrentUrl());
		// 13. Close the browser
	        browserObject.close();

	}

}
