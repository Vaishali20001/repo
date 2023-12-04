package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(name="username") private WebElement usnTB;
	
	@FindBy(name="password")private WebElement passTB;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath="//p[text()='Forgot your password? ']") private WebElement forgotpasslink;
	
	
		public LoginPage(WebDriver driver) 
		{
	      PageFactory.initElements(driver,this);
		}
		
		
		
	   //utilization
		
		public WebElement getUsnTB() {
			return usnTB;
		}
		
		public WebElement getPassTB() {
			return passTB;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		
		public WebElement getforgotLink() {
			return forgotpasslink;
		}
				
	   //operational
		public void validLogin(String validUsername,String validPassword)
		{
			usnTB.sendKeys(validUsername);
			passTB.sendKeys(validPassword);
			loginButton.click();
		}
		
		public void inValidLogin(String inValidUsername,String inValidPassword) throws InterruptedException
		{
			usnTB.sendKeys(inValidUsername);
			passTB.sendKeys(inValidPassword);
			loginButton.click();
			Thread.sleep(2000);
			usnTB.clear();
		}
		
		
	
	}
	
	

