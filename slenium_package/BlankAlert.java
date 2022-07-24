package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// In this code we are trying to click on signIn button without passing the email and password value 
// Test each alert button one by one and see the output 

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
		// setProperty method is used to set the path of driver from system location
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        driver = new ChromeDriver();
	        // pass url
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locate the signIn button and click the button without passing the credentials 
	        driver.findElement(By.name("proceed")).click();
	        // Use Alert class in case of alert and to switch from webpage to alert box call switchTo() and alert()
	        Alert alert = driver.switchTo().alert();
	        Thread.sleep(3000);
		
		// get the text of alert box
	        System.out.println(alert.getText());
	        alert.accept();
	        driver.close();
	}

}
