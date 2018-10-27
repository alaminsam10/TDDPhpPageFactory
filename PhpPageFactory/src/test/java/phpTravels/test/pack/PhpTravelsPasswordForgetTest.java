package phpTravels.test.pack;

import org.testng.annotations.Test;

import phpTravels.base.script.PhpTravelsPasswordForgetBaseScript;

public class PhpTravelsPasswordForgetTest extends PhpTravelsPasswordForgetBaseScript {

	@Test
	public void phpTravelsURL() {
		
		URLread().forgetPasswordTabRead();
		URLread().emailTabSend();
		URLread().submitTab();
		URLread().readErrorTab();
		
		
	}
	
}
