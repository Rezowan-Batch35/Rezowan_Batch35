package com.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.unit.BaseConfig;

public class Login02 {
	//5 minutes
	public void getLogin() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfig("URL"));
		// sign in
		driver.findElement(By.xpath("")).click();
		// email
		driver.findElement(By.xpath("//*[@id='username']\\\"")).click();
		driver.findElement(By.xpath("//*[@id='username']\\\"")).sendKeys((BaseConfig.getConfig("USER")));
		// password
		driver.findElement(By.xpath("//*[@id='password']\"")).click();
		driver.findElement(By.xpath("//*[@id='password']\"")).sendKeys((BaseConfig.getConfig("PASSWORD")));
		// click find sign in
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		// close browser
		driver.quit();
	}

}
