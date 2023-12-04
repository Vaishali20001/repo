package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	static WebDriver driver;
	@BeforeMethod
public void Setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com");
	
}
public void teardown() {
	driver.quit();
}
 
}

