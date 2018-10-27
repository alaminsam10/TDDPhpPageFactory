package phpTravels.login.pack;

import org.openqa.selenium.WebDriver;

public class PhpTravelsLoginController {
	
	PhpTravelsLoginElements verify;
	
	public PhpTravelsLoginController(WebDriver driver) {
		this.verify = new PhpTravelsLoginElements(driver);
		
	}
	public void emailTabSend() {
		verify.emailTab().sendKeys("al@gmail.com");
		
	}
	public void passwordTabSend() {
		verify.passwordTab.sendKeys("12312");
		
	}
	public void loginTabClick() {
		verify.loginTab.click();
	}
	public void errorTabRead() {
		String str = verify.errorTab.getText();
		System.out.println("This is the error message : "+str);
		
	}
	
}
