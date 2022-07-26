package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver browserDriver = new ChromeDriver();
        
      
      
//      The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing "ElementNotVisibleException" exception. It is an intelligent kind of wait, but it can be applied only for specified elements. 
//      It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.
//      
      
      WebDriverWait wait=new WebDriverWait(browserDriver, 20);
      String SiteTitle = "Google";
      // launch Chrome and redirect it to the Base URLWeb
      browserDriver.get("http://google.com" );
      //Maximizes the browser window
     
      WebElement gmailLink;
	// In case of explicit wait we locate a particular element
      gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
      gmailLink.click();
      //close browser
   browserDriver.quit();

	}

}
