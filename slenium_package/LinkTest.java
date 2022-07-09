package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        
        String urlLink = "https://www.google.com/";
        driver.get(urlLink);
        WebElement blogLink = driver.findElement(By.linkText("Gmail"));
        if (blogLink.isDisplayed()) {
            System.out.println("Gmail link is diplayed usingLinkText");
        } else {
            System.out.println("Unable to find Gmail");
        }
        driver.close();
	}

}
