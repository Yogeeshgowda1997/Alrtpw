package Newpkg4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownWindow {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		// checkbox
		Thread.sleep(2000);
System.out.println((driver.findElement(By.id("leaveList_chkSearchFilter_-1")).isSelected()));
		

		driver.findElement(By.id("leaveList_chkSearchFilter_-1")).click();
		System.out.println((driver.findElement(By.id("leaveList_chkSearchFilter_-1")).isSelected()));
		

		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());

		Thread.sleep(2000);
		// dropown
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='leaveList_cmbSubunit']"));
		Select drop = new Select(staticdropdown);
		drop.selectByIndex(4);
		System.out.println("The dropdown is selected by :" + drop.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		driver.close();

	}

}
