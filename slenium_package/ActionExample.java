package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        // Action class - action object -- passing driver information as parameter
        Actions action = new Actions(driver);    
//        By locator = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
        WebElement rightClickElement = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
        // contextClick is the method() of class Action
        action.contextClick(rightClickElement).build().perform();
	}

}
