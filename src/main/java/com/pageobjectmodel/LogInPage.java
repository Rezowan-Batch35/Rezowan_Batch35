package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.unit.Constant;

public class LogInPage {//Page object model

	
	public static By signIn = By.xpath("//*[@class='authorization-link']");
	
	public static By email = By.xpath("//*[@id='email']");

	public static By password = By.xpath("//*[@id='pass']");
	
	public static By finalSignIN = By.xpath("//*[@class='action login primary']");
}	
