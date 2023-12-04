package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void method3() {
		Reporter.log("method3() from Test2 class!!");
	}
	@Test
	public void method4() {
		Reporter.log("method4() from Test2 class!!");
	}
}
