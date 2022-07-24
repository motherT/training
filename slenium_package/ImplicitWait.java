package slenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
	// Set the path of chromeDriver browser
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	// Intialize value to the chromeDriver browser
        ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.todaytix.com/");
//        The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a "No Such Element Exception". 
// 	The default setting is 0. 
//        Once we set the time, the web driver will wait for the element for that time before throwing an exception
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

 // Locate all elements in webpage and click the signIn button
     driver.findElement(By.xpath("//*[@id=\"navBarSignUpButton\"]/span[1]")).click();
     driver.findElement(By.xpath("//span[text()='Email']")).click();
     driver.findElement(By.name("firstName")).sendKeys("firstname");
     driver.findElement(By.name("lastName")).sendKeys("lastName");

// In case we inspect the email element we see the value of attribute keep changing everytime. Here we need implicit wait to locate element
     driver.findElement(By.name("email")).sendKeys("info@gmail.com");
     driver.findElement(By.name("confirmEmail")).sendKeys("info@gmail.com");
     driver.findElement(By.name("password")).sendKeys("password"); 
     driver.findElement(By.id("sign-up-submit")).click();
     driver.close();

	}

}
