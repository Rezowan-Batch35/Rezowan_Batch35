package com.cucumber.bdd.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	@Given("Go to applicaion in QA")
	public void go_to_applicaion_in_qa() {
	    //code
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com");
	}

	@When("click sign in button")
	public void click_sign_in_button() {
	   
	}

	@When("put valid user")
	public void put_valid_user() {
	    
	}

	@When("put valid password")
	public void put_valid_password() {
	    
	}

	@When("click sgin in")
	public void click_sgin_in() {
	    
	}

	@Then("check sgin out button")
	public void check_sgin_out_button() {
	  
	}



	
	
}
