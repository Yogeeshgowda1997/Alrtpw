package Newpkg4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//Simple alert
	driver.findElement(By.id("alertBox")).click();
	 Alert simpleAlert = driver.switchTo().alert();
	 System.out.println(simpleAlert.getText());//Try to print the text
	 Thread.sleep(2000);
	 simpleAlert.accept(); //To click on the ‘OK’ button of the alert
	 Thread.sleep(2000);
	 System.out.println(driver.findElement(By.id("output")).getText());//output text
	
	 
	 
	//Confirmation alert
   driver.findElement(By.id("confirmBox")).click();
	 Alert confirmationAlert = driver.switchTo().alert();
	 System.out.println(confirmationAlert.getText());
	 Thread.sleep(2000);
	 confirmationAlert.dismiss(); //To click on the ‘Cancel’ button of the alert
	 //Thread.sleep(2000);
	 System.out.println(driver.findElement(By.id("output")).getText());
	 driver.quit(); 
	 
	 
	    //Prompt alert
	/*	 driver.findElement(By.id("promptBox")).click();
		 Alert promptAlert = driver.switchTo().alert();
		 System.out.println(promptAlert.getText()); // To capture the alert message
		 promptAlert.sendKeys("Yogish"); //To send some data to alert box
		 promptAlert.accept();
		 System.out.println(driver.findElement(By.id("output")).getText());
		 driver.quit(); */
		 
		 
	}

}
