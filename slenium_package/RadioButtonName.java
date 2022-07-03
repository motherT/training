package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://training.qaonlinetraining.com/testPage.php");
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        
		WebElement checkboxBoat = driver.findElement(By.name("boat"));
//      checkbox bike
		  Thread.sleep(3000);
      WebElement checkboxBike = driver.findElement(By.name("bike"));
//      checkbox car
      Thread.sleep(3000);
      WebElement checkboxCar = driver.findElement(By.name("car")); // selected by-default
      // checkbox horse
      WebElement checkboxHorse = driver.findElement(By.name("horse"));
      // submit button
      WebElement submitButton = driver.findElement(By.name("submit"));
//      selecting all options except car- selected by-default
      checkboxBoat.click();
      checkboxBike.click();
      checkboxHorse.click();
      System.out.println("wait 3 seconds and submit and close");
      submitButton.click();
      Thread.sleep(3000);
      driver.close();
	}

}
