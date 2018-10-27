package phpTravels.base.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import phpTravels.forget.password.pack.PhpTravelsPasswordForgetController;


public class PhpTravelsPasswordForgetBaseScript {

	
	protected WebDriver driver;
	public static final String URL = "https://phptravels.org/clientarea.php?incorrect=true";
	
	public PhpTravelsPasswordForgetBaseScript() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
		
	}
	
	@BeforeClass
	public void beforeTest() {
	
		this.driver.get(URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}
	
	public PhpTravelsPasswordForgetController URLread() {
		return new PhpTravelsPasswordForgetController(this.driver);
		
	}
	
	@AfterClass
	public void afterClass() {
		
		String actualURL = this.driver.getCurrentUrl();
		String expectedURL = "https://phptravels.org/pwreset.php";
		Assert.assertEquals(actualURL, expectedURL);
		System.out.println("Pass the test.");
		driver.close();
	}
	
}
