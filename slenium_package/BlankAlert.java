package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// In this code we are trying to click on signIn button without passing the email and password value 
// Test each alert button one by one and see the output 

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver browserDriver;
		// Set the path driver 
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        browserDriver = new ChromeDriver();
	        // pass url of website 
	        browserDriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locate the signIn button and click the button without passing the credentials 
	        browserDriver.findElement(By.name("proceed")).click();
	        // Use Alert class in case of alert and to switch from webpage to alert box call switchTo() and alert()
	        Alert alert = browserDriver.switchTo().alert();
	        Thread.sleep(3000);
		
		// get the text of alert box
	        System.out.println(alert.getText());
	        alert.accept();
	        browserDriver.close();
	}

}
