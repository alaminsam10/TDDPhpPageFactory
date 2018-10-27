package phpTravels.forget.password.pack;

import org.openqa.selenium.WebDriver;

public class PhpTravelsPasswordForgetController {
	
	PhpTravelsPasswordForgetElements readURL;
	
	public PhpTravelsPasswordForgetController(WebDriver driver) {
		this.readURL = new PhpTravelsPasswordForgetElements(driver);
	}
	
	public void forgetPasswordTabRead() {
		
		readURL.forgetPasswordTab.click();
	}
	
	public void emailTabSend() {
		
		readURL.emailTab.sendKeys(" naruto@talentech.com");
	}
	
	public void submitTab() {
		readURL.submitTab.click();
	}
	
	public void readErrorTab() {
		String str = readURL.readErrorTab.getText();
		System.out.println("This is the error message : "+str);
	}
	

}
