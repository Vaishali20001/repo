package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method2() {
	 // System.out.println("mehod2 from Demo2 class!!");
	  Reporter.log("method2 from Demo1 class!",true);
	  
  }
  @Test
  public void method3(){
	  Reporter.log("method3 from Demo1 class!",true);
	  }
  }
