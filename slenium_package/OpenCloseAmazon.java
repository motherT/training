package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		
	// setProperty method is used to set the path of driver from system location
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	// Create the object of the driver
        ChromeDriver driver = new ChromeDriver();
	// Using driver object call the get method used for passing link.
        driver.get("http://www.amazon.com/");
	// close method is used to close the driver 
        driver.close();
	}

}
