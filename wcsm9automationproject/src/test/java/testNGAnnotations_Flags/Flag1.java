package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test
  public void Method1() {
	  Reporter.log("method1 from Flag1",true);
  }
}
