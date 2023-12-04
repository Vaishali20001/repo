package testNGAnnotations_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	 @Test(description=" Login  performed!!")
	  public void loginMethod() {
		  Reporter.log("method1 for Login page", true);
	  }
	  @Test(description="UserCreated",dependsOnMethods="loginMethod")
	  public void createUserMethod() {
		  Assert.fail();
		  Reporter.log("method2 for user page", true);
		  
	  }
	  @Test(description="Logout performed!!",dependsOnMethods="createUserMethod")
	  public void logoutmethod() {
		  Reporter.log("method3 for Logout  page", true);
	  }
	  
}
