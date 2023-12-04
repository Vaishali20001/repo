package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement usnTB = driver.findElement(By.name("username"));
	usnTB.sendKeys("Admin");
	
	System.out.println(usnTB);
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	usnTB.sendKeys("admin");
	
}
}
