package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver;
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        driver = new ChromeDriver();
//	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//	        driver = new FirefoxDriver();
	        // pass url
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        driver.findElement(By.name("proceed")).click();
	        // Calling Alert class - creating alert object
	        Alert alert = driver.switchTo().alert();
	        Thread.sleep(3000);
	        System.out.println(alert.getText());
	        alert.accept();
	        //alert.sendKeys("a");
	        driver.close();
	}

}
