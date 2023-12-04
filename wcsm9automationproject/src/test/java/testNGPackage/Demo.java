package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() {
	 //System.out.println("method1 to from demo class");
	  Reporter.log("method1 to from demo class",true);
  }
  @Test
  public void method2() {
	  //System.out.println("method2 to from demo class");
	  Reporter.log("method2 to from demo class",true);
  }
}
