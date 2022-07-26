package testngPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	WebDriver browserDriver;
	 @Test(dataProvider = "dp")
	    public void checking(String userName, String passWord, String msg) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        // create object name driver of type ChromeDriver
	        browserDriver = new ChromeDriver();
	        browserDriver.get("https://admin-demo.nopcommerce.com/login");
	        WebElement username = browserDriver.findElement(By.name("Email"));
	        WebElement password = browserDriver.findElement(By.name("Password"));
	        WebElement submitBtn = browserDriver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	        username.clear();
	        username.sendKeys(userName);
	        password.clear();
	        password.sendKeys(passWord);
	        submitBtn.click();
	        System.out.println("End Result: Form submitted");
	        Thread.sleep(2000);
	    }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	new Object[] { "admin", "admin132" ,"Wrong Credentials"}, 
        new Object[] { "admin", "admnhhj","Wrong Credentials" },
        new Object[] { "admin@yourstore.com", "admin","Test Passed" },
    };
  }
}
