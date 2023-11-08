package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://jqueryui.com/droppable/");
	
	//driver.switchTo().frame(0);
	//Thread.sleep(2000);
	
   WebElement frametargetElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
   driver.switchTo().frame(frametargetElement );
	
	WebElement src1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
  	WebElement target1 = driver.findElement(By.xpath("//p[text()='Drop here']"));
	
	Actions act = new Actions(driver);
	Thread.sleep(2000);
    act.dragAndDrop(src1, target1).perform();
	
}
}
