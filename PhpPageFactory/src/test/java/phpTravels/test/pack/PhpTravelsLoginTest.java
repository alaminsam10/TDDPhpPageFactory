package phpTravels.test.pack;

import org.testng.annotations.Test;

import phpTravels.base.script.PhpTravelsLoginBaseScript;

public class PhpTravelsLoginTest extends PhpTravelsLoginBaseScript{
	
	@Test
	public void phpTravelsVerifyPage() {
		testVerify().emailTabSend();
		testVerify().passwordTabSend();
		testVerify().loginTabClick();
		testVerify().errorTabRead();
		
	}

}
