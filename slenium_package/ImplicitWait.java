package slenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        ChromeDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        
//        The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a "No Such Element Exception". The default setting is 0. 
//        Once we set the time, the web driver will wait for the element for that time before throwing an exception
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        String SiteTitle = "Google";
        // launch Chrome and redirect it to the Base URL
        driver.get("http://google.com" );
        //Maximizes the browser window
        driver.manage().window().maximize() ;
        //get the actual value of the title
        String getTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (getTitle.equals(SiteTitle))
        {
        System.out.println( "Test Passed") ;
        }
        else {
        System.out.println( "Test Failed" );
        }
        //close browser
        driver.close();

	}

}
