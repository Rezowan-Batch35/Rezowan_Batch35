package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.LogInPage;
import com.unit.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stefdef {
	WebDriver driver;

	@Given("Open the browser")
	public void open_the_browser() {
		
	}

	@Given("Go to application URL")
	public void go_to_application_url() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.getConfig("URL"));

	}

	@When("put valid username")
	public void put_valid_username() {
		driver.findElement(LogInPage.signIn).click();
		driver.findElement(LogInPage.email);
		
	}

	@When("put valid password")
	public void put_valid_password() {
		driver.findElement(LogInPage.password);
	}

	@When("click login")
	public void click_login() {
		driver.findElement(LogInPage.finalSignIN);
	}

	@Then("check sign out button")
	public void check_sign_out_button() {

	}

	@When("put invalid username")
	public void put_invalid_username() {

	}

	@When("put invalid password")
	public void put_invalid_password() {

	}

	@Then("click sign out button")
	public void click_sign_out_button() {

	}
}
