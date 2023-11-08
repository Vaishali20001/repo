package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBluestone {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.className("deny-btn")).click();
	driver.switchTo().frame("fc_widget");  
	//driver.switchTo().frame(6);
	
	
	driver.findElement(By.id("chat-icon")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.id("chat-fc-name")).sendKeys("Vaishali");
	driver.findElement(By.id("chat-fc-email")).sendKeys("vaishali@gmail.com");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("122345677788");
	driver.findElement(By.partialLinkText("Start Chat")).click();
	
	
	
	
}
}
