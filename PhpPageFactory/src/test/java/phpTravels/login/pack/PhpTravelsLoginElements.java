package phpTravels.login.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsLoginElements {
	WebDriver driver;
	
	public PhpTravelsLoginElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\'inputEmail\']")
	WebElement emailTab;
	public  WebElement emailTab() {
		return emailTab;
	}
	
	@FindBy(xpath = "//*[@id=\'inputPassword\']")
	WebElement passwordTab;
	public  WebElement passwordTab() {
		return passwordTab;
	}
	
	@FindBy(xpath = "//*[@id=\'login\']")
	WebElement loginTab;
	public WebElement loginTab() {
		return loginTab;
	}
	
	@FindBy(xpath = "//*[@id=\'main-body\']/div/div/div[1]/div/div[2]")
	WebElement errorTab;
	public WebElement errorTab() {
		return errorTab;	
	}
	
	
	}
