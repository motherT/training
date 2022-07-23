package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		
		WebDriver driver;
        // set the path of driver 
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        
        String urlLink = "https://www.google.com/";
        driver.get(urlLink);
        WebElement blogLink = driver.findElement(By.linkText("Gmail"));
	// isDisplayed method is used to check whether the element is displayed on webpage
        if (blogLink.isDisplayed()) {
            System.out.println("Gmail link is diplayed usingLinkText");
        } else {
            System.out.println("Unable to find Gmail");
        }
        driver.close();
	}

}
