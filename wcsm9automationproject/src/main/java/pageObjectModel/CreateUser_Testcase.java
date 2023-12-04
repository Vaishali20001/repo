package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;



public class CreateUser_Testcase extends BaseTest{


public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.setUp();
	//read the data from property and excel file
			Flib flib = new Flib();
			
			//to perform  VALID login use Login page pom 
			LoginPage lp = new LoginPage(driver);
			lp.validLogin(flib.readDataFromProperty(PROP_PATH,"Username"),flib.readDataFromProperty(PROP_PATH,"Password"));
			
			Thread.sleep(2000);
			
			//to work Admin Module use HomePage Pom
			HomePage hp = new HomePage(driver);
			
			Thread.sleep(2000);
			
			Actions act = new Actions(driver);
			act.doubleClick(hp.getAdmin()).perform();
			
			Thread.sleep(2000);
			AdminPage ap = new AdminPage(driver);
			ap.create_New_User_Method(flib.readDataFromExcel(EXCEL_PATH,USERCREDS_SHEET,1,0));
			
			//Thread.sleep(2000);
			//bt.tearDown();
			
			
		//	bt.tearDown();
		}
}



