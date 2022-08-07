// In this testng code, we are using assert method to check output and the expected output.
// Steps to perform
// 1. Create a method and add @Test.
// 2. setup the property of chromedriver and use  "assertEquals method " through chrome web browser.
// 3.  Initialize Webdriver object through ChromeDriver class.
// 4. pass the https://google.com link using get method 
// 5. Define the title value that we are expecting.
// 6. Get the title value of the website using getTitle method 
// 7. Using assertEquals method pass both value and if the value matches then the test will pass or else fail.


package testngPackage;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTitle {
	// 1. Create a method and add @Test.
	@Test
	  public void checkGoogleSite() {
	      WebDriver browserObject;
	        // 2. setup the property of chromedriver and use  "assertEquals method " through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 // 3.  Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
		  // 4. pass the https://google.com link using get method 
	        browserObject.get("https://google.com");
	        // 5. Define the title value that we are expecting.
	        String expectedTitle = "Google";
		  // 6. Get the title value of the website using getTitle method 
	        String actualTitle = browserObject.getTitle();
	        // 7. Using assertEquals method pass both value and if the value matches then the test will pass or else fail.
	        assertEquals(actualTitle, expectedTitle);
	        
	  }
}
