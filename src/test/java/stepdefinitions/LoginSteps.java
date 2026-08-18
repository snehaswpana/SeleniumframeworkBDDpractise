package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;
import utils.ConfigReader;

public class LoginSteps{
	private loginpage login_Page;
	private WebDriver driver;
	
	 @Given("I open Google")
	    public void i_open_google() {
		
		 driver = DriverManager.getDriver();
		 login_Page = new loginpage(driver);

	        driver.get(ConfigReader.getProperty("url"));
	        //driver.get(ConfigReader.getProperty("url"));
	    }

	    @When("I search for {string}")
	    public void i_search_for(String text) {
	    	login_Page.enterSearchText(text);
	    }

	    @Then("the search should be performed")
	    public void the_search_should_be_performed() {
	        Assert.assertTrue(driver.getTitle().contains("Google"));
	    }

}
