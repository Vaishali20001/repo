package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority=2)
  public void method1() {
	  Reporter.log("method1",true);
  }
  @Test(priority=1)
  public void method2() {
	  Reporter.log("method2",true);
  }
  @Test(priority=3)
  public void method3() {
	  Reporter.log("method3",true);
  }
  @Test
  public void method4() {
	  Reporter.log("method4",true);
  }
  @Test(priority=4)
  public void method5() {
	  Reporter.log("method5",true);
  }

}
