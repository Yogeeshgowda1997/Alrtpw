package Newpkg4;

import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandls {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 String Parenthandle=driver.getWindowHandle();
		 System.out.println("parent windo : "+Parenthandle);
		 
		 driver.findElement(By.id("newTabBtn")).click();
		 Set<String> handles=driver.getWindowHandles();
		 for( String handle : handles) {
			 System.out.println(handle);
			 if(!handle.equals(Parenthandle)){
			 driver.switchTo().window(handle);
			// driver.findElement(By.id("firstName")).sendKeys("xyz");
			 Thread.sleep(5000);
			 driver.close();
		 }
		 }
		driver.switchTo().window(Parenthandle);
		Thread.sleep(50000);
		 driver.quit();
		 
	
		
	}

}
