package phpTravels.forget.password.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsPasswordForgetElements {
	
	WebDriver driver;
	
	public PhpTravelsPasswordForgetElements(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\'main-body\']/div/div/div[1]/div/div[4]/div[1]/form/div[4]/a")
	WebElement forgetPasswordTab;
	public WebElement forgetPasswordTab() {
		return forgetPasswordTab;
		
	}
	
	@FindBy(xpath = "//*[@id=\'inputEmail\']")
	WebElement emailTab;
	public WebElement emailTab() {
		return emailTab;
	}
	
	@FindBy(xpath = "//*[@id=\'main-body\']/div/div/div[1]/div/form/div[2]/button")
	WebElement submitTab;
	public WebElement submitTab() {
		return submitTab;
		
	}
	
	@FindBy(xpath = "//*[@id=\'main-body\']/div/div/div[1]/div/div[2]")
	WebElement readErrorTab;
	public WebElement readErrorTab() {
		return readErrorTab;
	}
	
}
