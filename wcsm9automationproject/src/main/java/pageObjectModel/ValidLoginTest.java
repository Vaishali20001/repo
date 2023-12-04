package pageObjectModel;

import java.io.IOException;

public class ValidLoginTest extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		// to open & close Browser
		BaseTest bt = new BaseTest();
		//bt.openBrowser();
		Thread.sleep(2000);
		//perform valid Login Operation
		// refer the webElements from LoginPage pom
		LoginPage lp = new LoginPage(driver);
		// read the validUsername & validPassword
		Flib flib = new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"Username"),flib.readDataFromProperty(PROP_PATH,"Password"));
		Thread.sleep(2000);
	   // bt.closeBrowser();
		
	}
}
