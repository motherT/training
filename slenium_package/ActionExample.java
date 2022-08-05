// In this selenium code we will perform Right Click action.
// Steps to perform in case of Right Click . 
// 1. setup the property of chromedriver because we will perform testing of Mouse Over operation through chrome web browser.
// 2. Initialize WebDriver object through ChromeDriver class.
// 3. Open the web page http://swisnl.github.io/jQuery-contextMenu/demo.html
// 4. In case of rightclick we use Actions class.Create refernce and pass the driver to the reference
// 5. Get the reference of button to perform right click.
// 6. Using the action reference call the contextclick method and pass  element to perform right click

package slenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {
	public static void main(String[] args) {
		// 1. setup the property of chromedriver because we will perform testing of Mouse Over operation through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page http://swisnl.github.io/jQuery-contextMenu/demo.html
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        // 4. In case of dropdown we use Actions class.Create refernce and pass the driver to the reference
        Actions action = new Actions(browserObject);    
	// 5. Get the reference of button to perform right click.
        WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
       // 6. Using the action reference call the contextclick method and pass  element to perform right click
        action.contextClick(rightClickElement).build().perform();
	}

}
