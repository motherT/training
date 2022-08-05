// In this TestNg code, we are trying to execute mutiple test case and get the test report.
// Perform the steps
// 1. The @Test will generate the test report of each method used
// 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
// 3. Initialize WebDriver object through ChromeDriver class.
// 4. Open the web page http://www.amazon.com/ in first test case 
// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
// 6. close the browser

package testngPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWebsites {
WebDriver driver;
	// 1. The @Test will generate the test report of each method used
	@Test
    public void openingAmazonSite() throws InterruptedException {
        // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        driver = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	 // 4. Open the web page http://www.amazon.com/ in first test case 
        driver.get("http://www.amazon.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	// 6. close the browser
        driver.close();
    }
	
     // 1. The @Test will generate the test report of each method used
    @Test
    public void openingCNNSite() throws InterruptedException {
	 // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        driver = new ChromeDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
	 // 4. Open the web page http://www.cnn.com/ in first second case 
        driver.get("http://www.cnn.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
        driver.close();
    }
    
     // 1. The @Test will generate the test report of each method used
    @Test
    public void openingYahooSite() throws InterruptedException {
        // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        driver = new ChromeDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
	// 4. Open the web page http://www.yahoo.com/ in first test case 
        driver.get("http://www.yahoo.com/");
	  // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	  // 6. close the browser
        driver.close();
    }
}
