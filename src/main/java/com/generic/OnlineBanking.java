package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.pageobjectmodel.OnlineBankingLoginPage;

public class OnlineBanking {
	
	
	public static void getLogin() throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rezow/Downloads/Online%20banking_dev.html");
		//put user 
		driver.findElement(By.xpath("//*[@id='username']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch35");
		//put pass 
		driver.findElement(By.xpath("//*[@id='password']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
		//click login 
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		//Assertion
		Assert.assertTrue(driver.findElement(OnlineBankingLoginPage.login ))
	}
	
}
