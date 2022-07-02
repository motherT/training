package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com/");
        driver.close();
	}

}
