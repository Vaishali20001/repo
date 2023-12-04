package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	

	//it is use to store all webelements of Admin page
	@FindBy(xpath ="//button[text()=\" Add \"]") private WebElement Add_Button ;
	@FindBy(xpath="(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]") private WebElement User_Role_dropdown;
	@FindBy(xpath="//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]") private WebElement Employeename_TB;
	@FindBy(xpath="//div[@class=\"oxd-select-text oxd-select-text--active\"]") private WebElement Status_Dropdown;
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]") private WebElement Username_TB;
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[3]") private WebElement Password_TB;
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[4]") private WebElement Confirm_Password_TB;
	@FindBy(xpath="//button[text()=\" Save \"]") private WebElement Save_Button;
	
	//initialization
	public AdminPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
//utilization
	public WebElement getAdd_Button() {
		return Add_Button;
	}

	public WebElement getUser_Role_dropdown() {
		return User_Role_dropdown;
	}

	public WebElement getEmployeename_TB() {
		return Employeename_TB;
	}

	public WebElement getStatus_Dropdown() {
		return Status_Dropdown;
	}

	public WebElement getUsername_TB() {
		return Username_TB;
	}

	public WebElement getPassword_TB() {
		return Password_TB;
	}

	public WebElement getConfirm_Password_TB() {
		return Confirm_Password_TB;
	}

	public WebElement getSave_Button() {
		return Save_Button;
	}
//operational methods
	public void create_New_User_Method(String userName) {
		Add_Button.click();
		//User_Role_dropdown.click();
		Select sel = new Select(User_Role_dropdown);
		sel.selectByIndex(0);
		Employeename_TB.sendKeys("Employeename");
		Select sel2 = new Select(Status_Dropdown);
		sel2.getFirstSelectedOption();
		Username_TB.sendKeys("Username");
		Password_TB.sendKeys("Password");
		 Confirm_Password_TB.sendKeys("ConfirmPassword");
		 Save_Button.click();
	}
	
		
	}
	
		


