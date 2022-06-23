package Newpkg4;

import java.util.Set;

import javax.swing.Action;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Finding count of links
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Create Actions class object
		Actions a=new Actions(driver);
		//mouseover on leaves tab
		WebElement move=driver.findElement(By.xpath("//b[contains(text(),'Leave')]"));
		//contextclick is mouseover on leaves and right click the mouse
		a.moveToElement(move).contextClick().build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		
		//send capital letters to element using shift key
		a.moveToElement(driver.findElement(By.id("searchSystemUser_userName"))).click().keyDown(Keys.SHIFT).sendKeys("yogeeshagowda").doubleClick().build().perform();

		
	
		
		

	}

}
