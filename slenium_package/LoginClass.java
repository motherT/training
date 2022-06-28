package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");
       
        WebElement email=driver.findElement(By.id("Email"));
        email.clear();
        WebElement password=driver.findElement(By.id("Password"));
        password.clear();
        email.sendKeys("admin@yourstore.com");
        password.sendKeys("admin");
        WebElement button=driver.findElement(By.className("button-1"));
        button.submit();
	}

}
