package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void method5() {
	Reporter.log("method5() fron Test3 class!!");
}

@Test
public void method6() {
	int a=5;
	int b=1;
	int res=a/b;
	Reporter.log("method6() fron Test3 class!!",+res,true);
}
}
