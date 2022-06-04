package hrmPackagesFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.CommonMethods;

public class HRM extends CommonMethods{
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(name = "txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(linkText ="PIM")
	public WebElement pim;
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployee;
	
	@FindBy(id ="first-name-box")
	public WebElement firstName;
	
	@FindBy(id="last-name-box")
	public WebElement lastName;
	
	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;
	
	@FindBy(id="employeeId")
	public WebElement employeeId;
	
	@FindBy(id="modal-save-button")
	public WebElement saveButton;
	
	//After add employee, you will see the name
	//at the top left side
	@FindBy(id="pim.navbar.employeeName")
	public WebElement Name;
	
	
	
	public HRM(){
		
		PageFactory.initElements(driver, this);
	}

}
