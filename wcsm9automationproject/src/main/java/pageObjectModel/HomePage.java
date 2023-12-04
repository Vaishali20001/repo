package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//store all modules of Homepage
	
	
	@FindBy(xpath="(//ul[@class='oxd-main-menu']/descendant::a)[1]") private WebElement Admin_Module;
	@FindBy(xpath="//a[@class=\"oxd-main-menu-item active toggle\"]")private WebElement PIM_Module;
	@FindBy(xpath="//a[@class=\"oxd-main-menu-item active toggle\"]")private WebElement Leave_Module;
	@FindBy(xpath="//a[@class='oxd-main-menu-item active toggle']")private WebElement Time_Module;
	@FindBy(xpath="//a[@class='oxd-main-menu-item active toggle']")private WebElement Recruitement_Module;
	@FindBy(xpath="//a[@class='oxd-main-menu-item active toggle']")private WebElement MyInfo_Module;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAdmin() {
		return Admin_Module;
	}	
	public WebElement getPIM() {
		return PIM_Module;
	}
	public WebElement getLeave() {
		return Leave_Module;
	}
	public WebElement getTime() {
		return Time_Module;
	}
	public WebElement getRecruitement() {
		return Recruitement_Module;
	}
	public WebElement getMyInfo() {
	
		return MyInfo_Module;
	}

	public void click_on_Admin_Module()
	{
		Admin_Module.click();
	}
	
	public void click_on_PIM_Module()
	{
		PIM_Module.click();
	}

	public void click_on_Leave_Module()
	{
		Leave_Module.click();
	}
	
	public void click_on_Time_Module()
	{
       Time_Module.click();		
	}
	
	public void click_on_Recruitement_Module()
	{
		
		Recruitement_Module.click();
	}
	
	public void click_on_MyInfo_Module() 
	{
		 MyInfo_Module.click();
	}
	
	
}
