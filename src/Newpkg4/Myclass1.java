package Newpkg4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();//To click on the ‘Cancel’ button of the alert
		
		driver.findElement(By.name("cusid")).sendKeys("@1234");//To send some data to alert box

		driver.findElement(By.name("submit")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 
		 
		 driver.switchTo().alert().accept(); //To click on the ‘OK’ button of the alert
		 Thread.sleep(2000);
	//	 System.out.println(driver.findElement(By.id("output")).getText());
		 driver.quit(); 
		 
	}

}
