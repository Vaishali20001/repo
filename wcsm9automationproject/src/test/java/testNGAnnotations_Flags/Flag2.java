package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test
  public void method1() {
	  Reporter.log("method1 from login",true);
  }
  @Test
  public void method2() {
	  Reporter.log("method1 from Users",true);
  }
  @Test
  public void method3() {
	  Reporter.log("method1 from Logout",true);
  }

}
