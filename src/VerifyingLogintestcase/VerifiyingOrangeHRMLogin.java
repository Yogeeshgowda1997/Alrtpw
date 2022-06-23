package VerifyingLogintestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Loginapplicationpage.Loginpage;




public class VerifiyingOrangeHRMLogin {
	//String driverPath = "C:\\Driver\\chromedriver.exe";
	//WebDriver driver;
	
	@Test
	public void verifyingvalidlogin() {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	Loginpage log=new Loginpage(driver);
	
	log.typeusername();
	log.typepassword();
	log.typeLogin();
	}
}
