package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FormFillUp_Chrome {
public static void main(String[] args) {
	String urlString = "http://www.training.qaonlinetraining.com/testPage.php";
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    // opening website for form fill up
    driver.get(urlString);
    
    // sending text to the input box in the web form--------------
    // filling the name section
    driver.findElement(By.name("name")).sendKeys("DemoName");
    System.out.println("name\")).sendKeys(\"DemoName");
    // E mail section
    driver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
    System.out.println("email\")).sendKeys(\"DemoEmail@demo.com");
    // Website section
    driver.findElement(By.name("website")).sendKeys("www.demosite.com");
    System.out.println("website\")).sendKeys(\"www.demosite.com");
    // Comment section
    driver.findElement(By.name("comment")).sendKeys("demo comment");
    System.out.println("comment\")).sendKeys(\"demo comment");
    
    // Clicking radio button --------------------
    // Female Radio button select
    driver.findElement(By.xpath("//input[@value='female']")).click();
    System.out.println("value='female']\")).click");
    // male Radio button select
    driver.findElement(By.xpath("//input[@value='male']")).click();
    System.out.println("value='male']\")).click");
    // Other Radio button select
    driver.findElement(By.xpath("//input[@value='Other']")).click();
    System.out.println("value='Other']\")).click");
    // Clicking check-boxes What do you have: ---- Car is selected by default
    // Removing car option -- un-check
    driver.findElement(By.name("car")).click(); //-- this will un-check the car option as it is already selected
    System.out.println("By.name(\"car\")).click--uncheck");
    // Bike option check
    driver.findElement(By.name("bike")).click();
    System.out.println("By.name(\"bike\")).click");
    // boat option check
    driver.findElement(By.name("boat")).click();
    System.out.println("By.name(\"boat\")).click");
    // horse option check
    driver.findElement(By.name("horse")).click();
    System.out.println("By.name(\"horse\")).click");
    // Using Select option from selenium library
    // selecting option from menu web elements -- Country list select -- DropDown list
    //creating object for selecting web element
    Select countrySelect = new Select(driver.findElement(By.name("country")));
    // using countrySelect to select the visible text from the drop-down menu
    countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
    //or
    countrySelect.selectByVisibleText("France");
    
    //Select Option for skill menu
    Select skillSelect = new Select(driver.findElement(By.name("skill")));
    //using skillSelect to select menu options -- Programming
    skillSelect.selectByVisibleText("Programming");
    System.out.println("selectByVisibleText(\"Programming");
    //OR
    //using skillSelect to select menu options -- Database
    skillSelect.selectByVisibleText("Database");
    System.out.println("selectByVisibleText(\"Database");
    
    //Click on Send Button
    driver.findElement(By.name("submit")).click();
    System.out.println("Form Fill-up Succesfull");
}
}
