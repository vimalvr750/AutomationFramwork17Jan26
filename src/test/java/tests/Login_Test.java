package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import base.BaseTest;
import listeners.TestListener;

@Listeners(TestListener.class)

public class Login_Test extends BaseTest {
	
	@Test
	public void Login_Orange_HRM() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title = driver.getTitle();
		
		Assert.assertTrue(false, title);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		String pageTitle = driver.getTitle();
		Assert.assertTrue(false, pageTitle);
		
		
		
		System.out.println("Test is Completed: " + title);
		
		System.out.println("Test is Success");
		
		System.out.println("Added print to check git pull");
	}
}
