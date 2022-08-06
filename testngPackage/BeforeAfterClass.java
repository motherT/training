
package testngPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	WebDriver browserDriver;
    @Test
    public void performLogin() throws InterruptedException {
      System.out.println("Performing Login and wait for 2 seconds");
      browserDriver.get("https://admin-demo.nopcommerce.com/login");
      WebElement username = browserDriver.findElement(By.name("Email"));
      WebElement password = browserDriver.findElement(By.name("Password"));
      WebElement submitBtn = browserDriver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
      username.clear();
      username.sendKeys("admin@yourstore.com");
      password.clear();
      password.sendKeys("admin");
      submitBtn.click();
      System.out.println("End Result: Form submitted");
      Thread.sleep(2000);
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("--@beforeTest, set the browser, maximise the window");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        browserDriver = new ChromeDriver();
        browserDriver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() {
        System.out.println("--@afterTest, closing the browser window");
        browserDriver.close();
    }
}
