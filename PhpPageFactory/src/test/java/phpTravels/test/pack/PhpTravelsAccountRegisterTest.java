package phpTravels.test.pack;

import org.testng.annotations.Test;

import phpTravels.base.script.PhpTravelsAccountRegisterBaseScript;

public class PhpTravelsAccountRegisterTest extends PhpTravelsAccountRegisterBaseScript {

	@Test
	public void executeTest() {
		
		register().registerTabClick();
		register().firstNameTabSend();
		register().lastNameTabSend();
		register().emailTabSend();
		
		register().dropDownTabClick();
		register().selectCountryCodeTabClick();
		register().phoneNumTab();
		
		register().addressTab();
		register().cityTab();
		register().stateTab();
		register().postCodeTab();
		
		//register().countryNameTab();
		register().selectCountryNameTabClick();
		
		register().passwordTab();
		register().confirmPasswordTab();
		
		register().textTab();
		register().registerOneTab();
		register().readErrorMessTab();
		
		
	}
	
	
}
