/**
 * 
 */
package Loginapplicationpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author yogisha.j
 *
 *Page object model is just a design pattern not a framework
 *Page will be pure java classes
 *
 *Based on application behavior we will creating separate pages and will store all the locator and respective method to use them 
 *Easy to maintain
 *Easy Readability of scripts
 *Reduce or eliminate of duplicates
 *Re-usability of code
 *More reliable
 *
 *This loginpage class will store all the locator and method of login page
 */
public class Loginpage {
	
	
	WebDriver driver;
	
	By username=By.id("txtUsername");
	By password=By.xpath("//input[@id='txtPassword']");
	By loginBtn=By.xpath("//input[@id='btnLogin']");
	
	
	
	
	
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public void typeusername() {
		driver.findElement(username).sendKeys(" Admin");
		
	}
	public void typepassword() {
		driver.findElement(password).sendKeys("admin123");
	}
	public void typeLogin() {
		driver.findElement(loginBtn).click();
		
	}

}
