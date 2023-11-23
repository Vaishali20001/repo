package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHrmInvalidLogin extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	
BaseTest bt = new BaseTest();
bt.openBrowser();
 // to read data from excel
	Flib flib = new Flib();
	int rc = flib.rowCount("./src/main/resource/LoginData.xlsx","invalidcreads");
	
	for(int i=1; i<=rc;i++)
	{
		//String invalidUsn = flib.readDataFromExcel("./src/main/resource/LoginData.xlsx","invalidcreads",i,0);
		//String invalidPass = flib.readDataFromExcel("./src/main/resource/LoginData.xlsx","invalidcreads",i,1);
		
		// to identify username text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromExcel(EXCEL_PATH,INVALIDCREDS_SHEET,i,0));
		
		//to identify password text box
		WebElement usnPass = driver.findElement(By.name("password"));
		usnTB.sendKeys(flib.readDataFromExcel(EXCEL_PATH,INVALIDCREDS_SHEET,i,1));
		
		//identify login button and click
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();				
	}
	bt.closeBrowser();
}
}
