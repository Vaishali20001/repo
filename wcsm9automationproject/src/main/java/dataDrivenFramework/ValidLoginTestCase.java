package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Flib flib = new Flib();
		String usnData = flib.readExcelData("./src/main/resource/LoginData.xlsx", "validcreds",1,0);

		String passData = flib.readExcelData("./src/main/resource/LoginData.xlsx", "validcreds",1,1);
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("password")).sendKeys(passData);

	}

}
