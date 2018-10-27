package phpTravels.register.account.pack;

import org.openqa.selenium.WebDriver;

public class PhpTravelsAccountRegisterController {
	
	PhpTravelsAccountRegisterElements registration;
	
	public PhpTravelsAccountRegisterController(WebDriver driver) {
		
		this.registration = new PhpTravelsAccountRegisterElements(driver);
	}
	
	public void registerTabClick() {
		registration.registerTab.click();
	}
	
	public void firstNameTabSend() {
		registration.firstNameTab.sendKeys("Bangla");
	}
	
	public void lastNameTabSend() {
		registration.lastNameTab.sendKeys("Mix");
	}

	public void emailTabSend() {
		registration.emailTab.sendKeys("banglamix10@gmail.com");
	}
	
	public void dropDownTabClick() {
		registration.dropDownTab.click();
			
	}
	
	public void selectCountryCodeTabClick() {
		registration.selectCountryCodeTab.click();
	}
	
	public void phoneNumTab() {
		registration.phoneNumTab.sendKeys("78129");
			
	}
	
	public void addressTab() {
		registration.addressTab.sendKeys("121 powe");			
	}
	
	public void cityTab() {
		registration.cityTab.sendKeys("Bronx");			
	}
	
	public void stateTab() {
		registration.stateTab.sendKeys("NY");			
	}
	
	public void postCodeTab() {
		registration.postCodeTab.sendKeys("10472");			
	}
	
//	public void countryNameTab() {
//		registration.countryNameTab.click();
//	}
	
	public void selectCountryNameTabClick() {
		registration.selectCountryNameTab.click();
	}
	
	public void passwordTab() {
		registration.passwordTab.sendKeys("1234");			
	}
	
	public void confirmPasswordTab() {
		registration.confirmPasswordTab.sendKeys("1234");			
	}
	
	public void textTab() {
		String str = registration.textTab.getText();	
		System.out.println("The code is : "+str);
	}
	
	public void registerOneTab() {
		registration.registerOneTab.click();			
	}
	
	public void readErrorMessTab() {
		String str = registration.errorMessTab.getText();
		System.out.println("This is the error message : "+str);
	}
	
	
}
