package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	// In this code we are trying to peform login to a website.
	// Locate the email and password input box 
	// clear the section as there is value by default and then send the value using sendkeys
	//Click the login button and submit the value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
	// pass the link of driver 
        driver.get("https://admin-demo.nopcommerce.com/login");
       
	// Locate the email text box and clear the text box
        WebElement email=driver.findElement(By.id("Email"));
        email.clear();
	// Locate the password text box and clear the text box
        WebElement password=driver.findElement(By.id("Password"));
        password.clear();
	// send values in email box
        email.sendKeys("admin@yourstore.com");
	// send values in password box
        password.sendKeys("admin");
	// Locate the signIn button 
        WebElement button=driver.findElement(By.className("button-1"));
	// submit the value
        button.submit();
	}

}