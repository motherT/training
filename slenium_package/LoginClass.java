package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// In this code we are trying to perform login to a website.
// Here we will locate the email and pasword input box section 
// In this case the email and pasword section is filled by default .So we need to clear this section. 
// Once all section are filled click the submit button
public class LoginClass {
	
	public static void main(String[] args) {
	
	WebDriver browserDriver;
	// Set the path of chromeDriver browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// Create the reference of the chromedriver browser
        browserDriver = new ChromeDriver();
	// get method helps to load the web pages in the browser that we pass in a given parameter.
        browserDriver.get("https://admin-demo.nopcommerce.com/login");
       
	// Locate the email text box and clear the text box using clear method 
        WebElement email=browserDriver.findElement(By.id("Email"));
        email.clear();
	// Locate the password text box and clear the text box using clear method 
        WebElement password=browserDriver.findElement(By.id("Password"));
        password.clear();
	// send values in email box
        email.sendKeys("admin@yourstore.com");
	// send values in password box
        password.sendKeys("admin");
	// Locate the signIn button and perform click
        WebElement button=browserDriver.findElement(By.className("button-1"));
	// submit the value
        button.submit();
	}

}
