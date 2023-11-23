package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfGoogle {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
	//click on Google apps
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	Thread.sleep(2000);
	
	//handle frame  by using int index
	driver.switchTo().frame(1);
	
	//click on Maps
	driver.findElement(By.xpath("//span[text()='Maps']")).click();
}
}
   