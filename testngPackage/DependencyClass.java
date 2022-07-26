package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
	WebDriver browserDriver;
	@Test
    public void openingAmazonSite() throws InterruptedException {
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        browserDriver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
        browserDriver.get("http://www.amazon.com/");
        Thread.sleep(2000);
        browserDriver.close();
    }
    @Test(dependsOnMethods ="openingAmazonSite")
    public void openingCNNSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        browserDriver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
        browserDriver.get("http://www.cnn.com/");
        Thread.sleep(2000);
        browserDriver.close();
    }
    @Test(dependsOnMethods ="openingCNNSite")
    public void openingYahooSite() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        browserDriver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        browserDriver = new FirefoxDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
        browserDriver.get("http://www.yahoo.com/");
        Thread.sleep(2000);
        browserDriver.close();
    }
}
