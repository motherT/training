package testngPackage;

import org.testng.annotations.Test;

public class GroupTestng {

	@Test(groups = "login",priority =1)
	  public void openWebsite() {
	      System.out.println("openWebsite");
	  }
	  @Test(groups = "login",priority =2)
	  public void enterData() {
	      System.out.println("enterData");
	  }
	  @Test(groups = "login",priority =3)
	  public void pressLogin() {
	      System.out.println("pressLogin");
	  }
	  @Test(groups = "explore",priority =4)
	  public void explorePage() {
	      System.out.println("explorePage");
	  }
}
