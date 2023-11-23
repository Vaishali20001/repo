package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmValidLogin extends BaseTest {

public static void main(String[] args) throws IOException {
	BaseTest bt = new BaseTest();
	
	Flib flib = new Flib();
	bt.openBrowser();
	
	WebElement usnTB = driver.findElement(By.name("username"));
	usnTB.sendKeys(flib.readDataFromProperty(PROP_PATH, "Username"));
	
	WebElement passTB = driver.findElement(By.name("password"));
	passTB.sendKeys(flib.readDataFromProperty(PROP_PATH, "Password"));
	
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
	
	
}
}
