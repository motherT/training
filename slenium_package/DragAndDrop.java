// In this selenium code we will perform drag and drop action.
// Steps to perform in case of drag and drop. 
// 1. setup the property of chromedriver because we will perform testing of drag and drop operation through chrome web browser.
// 2. Initialize ChromeDriver object through ChromeDriver class.
// 3. Open the web page http://jqueryui.com/droppable/
// 4. In this case we switch the focus to frame 
// 5. Get the reference of source element.
// 6. Get the reference of target element
// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 8. In case of dropdown we use Actions class.Create refernce and pass the driver to the reference
// 9. Using the action reference call the dragAndDrop method and pass the source and target element
// 10. Close the browser

package slenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	// 1. setup the property of chromedriver because we will perform testing of drag and drop operation through chrome web browser.
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 2. Initialize ChromeDriver object through ChromeDriver class.
	ChromeDriver browserDriver = new ChromeDriver();
	// 3. Open the web page http://jqueryui.com/droppable/	
	browserDriver.get("http://jqueryui.com/droppable/");
        // 4. In this case we switch the focus to frame 
        browserDriver.switchTo().frame(0);
        // 5. Get the reference of source element.
        WebElement source = browserDriver.findElement(By.xpath("//div[@id='draggable']"));
	// 6. Get the reference of target element
        WebElement target = browserDriver.findElement(By.xpath("//div[@id='droppable']"));
       
	// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(3000);

	// 8. In case of dropdown we use Actions class.Create refernce and pass the driver to the reference
        Actions act = new Actions(browserDriver);
        
        // 9. Using the action reference call the dragAndDrop method and pass the source and target element
        act.dragAndDrop(source, target).build().perform();
        
        Thread.sleep(3000);
	// 10. Close the browser
        browserDriver.close();

	}

}
