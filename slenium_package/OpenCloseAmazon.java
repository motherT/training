package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

// In this code we are trying open a amazon website in chromedriver browser
public class OpenCloseAmazon {

	public static void main(String[] args) {
		
	// Set the path of driver 
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	// Create the reference of the chromedriver browser 
        ChromeDriver browserDriver = new ChromeDriver();
	// pass the link of website in get method using the reference
        browserDriver.get("http://www.amazon.com/");
	// close method is used to close the chromedriver browser
        browserDriver.close();
	}

}
