//In this Selenium code,we are trying to check the text is link or not.
// Steps to perform 
// 1. setup the property of WebDriver to perform linktext through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page https://www.google.com/
// 4. Get the reference of the gmail text using textLink.
// 5. Then check  the text is displayed  or not on webpage
// 6. Close the browser

package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
public static void main(String[] args) {
		
	WebDriver browserObject;
       // 1. setup the property of WebDriver to perform linktext through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 2. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
       
	// 3. Open the web page https://www.google.com/
        browserObject.get(https://www.google.com/);
	// 4. Get the reference of the gmail text using textLink.		  
        WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
			  
			 
	// 5. Then check  the text is displayed  or not on webpage
        if (blogLink.isDisplayed()) {
            System.out.println("Gmail link is diplayed usingLinkText");
        } else {
            System.out.println("Unable to find Gmail");
        }
	// 6. Close the browser
        browserObject.close();
	}

}
