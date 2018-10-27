package phpTravels.register.account.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelsAccountRegisterElements {
	WebDriver driver;

	public PhpTravelsAccountRegisterElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\'header\']/div/ul/li[3]/a")
	WebElement registerTab;
	public WebElement registerTab() {
		return registerTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputFirstName\']")
	WebElement firstNameTab;
	public WebElement firstNameTab() {
		return firstNameTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputLastName\']")
	WebElement lastNameTab;
	public WebElement lastNameTab() {
		return lastNameTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputEmail\']")
	WebElement emailTab;
	public WebElement eamilTab() {
		return emailTab;
	}
	
	@FindBy(xpath = "//*[@id=\'containerNewUserSignup\']/div[2]/div[4]/div/div/div/div/div[2]")
	WebElement dropDownTab;
	public WebElement dropDownTab() {
		return dropDownTab;
	}
	
	@FindBy(xpath = "//*[@id=\'containerNewUserSignup\']/div[2]/div[4]/div/div/div/ul/li[2]/span[1]")
	WebElement selectCountryCodeTab;
	public WebElement selectCountryCodeTab() {
		return selectCountryCodeTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputPhone\']")
	WebElement phoneNumTab;
	public WebElement phoneNumTab() {
		return phoneNumTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputAddress1\']")
	WebElement addressTab;
	public WebElement addressTab() {
		return addressTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputCity\']")
	WebElement cityTab;
	public WebElement cityTab() {
		return cityTab;
	}
	
	@FindBy(xpath = "//*[@id=\'stateinput\']")
	WebElement stateTab;
	public WebElement stateTab() {
		return stateTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputPostcode\']")
	WebElement postCodeTab;
	public WebElement postCodeTab() {
		return postCodeTab;
	}
	
//	@FindBy(xpath = "//*[@id=\'inputCountry\']")
//	WebElement countryNameTab;
//	public WebElement countryNameTab() {
//		//Select sel = new Select(countryNameTab);
//		//sel.selectByVisibleText("United States");
//		return countryNameTab;
//	}
	
	@FindBy(xpath = "//*[@id='inputCountry']/option[233]")
	WebElement selectCountryNameTab;
	public WebElement selectCountryNameTab() {
		return selectCountryNameTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputNewPassword1\']")
	WebElement passwordTab;
	public WebElement passwordTab() {
		return passwordTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputNewPassword2\']")
	WebElement confirmPasswordTab;
	public WebElement confirmPasswordTab() {
		return confirmPasswordTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputCaptchaImage\']")
	WebElement textTab;
	public WebElement textTab() {
		return textTab;
	}
	
	@FindBy(xpath = "//*[@id=\'frmCheckout\']/p/input")
	WebElement registerOneTab;
	public WebElement registerOneTab() {
		return registerOneTab;
	}
	
	@FindBy(xpath = "//*[@id=\'main-body\']/div/div/div[3]/div[1]")
	WebElement errorMessTab;
	public WebElement errorMessTab() {
		return errorMessTab;
	}
	
}
