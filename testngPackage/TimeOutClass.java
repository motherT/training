package testngPackage;

import org.testng.annotations.Test;

public class TimeOutClass {

	@Test(timeOut = 1000)
    public void waitFor2Seconds() throws InterruptedException{
       System.out.println("waiting for 2 seconds,will be printed but, fail this test eventually");
       Thread.sleep(2000);
    }
    @Test(timeOut = 1000)
    public void simplePrint(){
           System.out.println("Printing is successful");
        }
}
