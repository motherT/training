package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

// In this code we are trying open a amazon website in chromedriver browser
public class OpenCloseAmazon {

	public static void main(String[] args) {
		
	// Set the path of driver 
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	// Create the reference of the chromedriver browser 
        ChromeDriver browserDriver = new ChromeDriver();
	// get method helps to load the web pages in the browser that we pass in a given parameter.
        browserDriver.get("http://www.amazon.com/");
	// close method is used to close the chromedriver browser
        browserDriver.close();
	}

}
