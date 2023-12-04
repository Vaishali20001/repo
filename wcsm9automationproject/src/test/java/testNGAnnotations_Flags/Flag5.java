package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description=" Login  performed!!")
  public void loginMethod() {
	  Reporter.log("method1 for Login page", true);
  }
  @Test(description="UserCreated",dependsOnMethods="loginMethod")
  public void createUserMethod() {
	  Reporter.log("method2 for user page", true);
	  
  }
  @Test(description="Logout performed!!",dependsOnMethods="createUserMethod")
  public void logoutmethod() {
	  Reporter.log("method3 for Logout  page", true);
  }
  
}
