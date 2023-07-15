package com.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.LogInPage;
import com.unit.BaseConfig;
import com.unit.Constant;

public class Login {

	public void getLogin() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfig("URL")); //good
		// sign in
		driver.findElement (LogInPage.signIn).click();
		// email
		driver.findElement(LogInPage.email).click();
		driver.findElement(LogInPage.email).sendKeys(BaseConfig.getConfig("email"));
		// password
		driver.findElement(LogInPage.password).click();
		driver.findElement(LogInPage.password).sendKeys(BaseConfig.getConfig("password"));
		// sign in
		driver.findElement(LogInPage.finalSignIN).click();
		//close broser
		driver.quit();
	}
}
