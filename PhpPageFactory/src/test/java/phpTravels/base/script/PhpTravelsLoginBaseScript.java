package phpTravels.base.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import phpTravels.login.pack.PhpTravelsLoginController;

public class PhpTravelsLoginBaseScript {
	
	protected  WebDriver driver;
	public static final String URL = "https://phptravels.org/clientarea.php?incorrect=true";
	
	public PhpTravelsLoginBaseScript() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
		
	}
	@BeforeClass
	public void beforeClass() {
		this.driver.get(URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public PhpTravelsLoginController testVerify() {
		return new PhpTravelsLoginController(this.driver);		
	}
	
	
	@AfterClass
	public void afterClass() {
		
		driver.close();
	}
	
	
}
