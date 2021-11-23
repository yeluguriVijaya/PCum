package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pojo.AdactinPagePojo;
import com.utils.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdactinSteps extends LibGlobal{

	
	@Given("User launch the browser and navigates to hotel booking app")
	public void user_launch_the_browser_and_navigates_to_hotel_booking_app() {
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */
		/*
		 * getDriver(); driver.get("http://adactinhotelapp.com");
		 */
		//getDriver();
		gerUrl("http://adactinhotelapp.com/");
	}

	@When("User enters the credentials in hotel booking app")
	public void user_enters_the_credentials_in_hotel_booking_app() {
		
		AdactinPagePojo a = new AdactinPagePojo();
		insertType(a.getTxtUserName(), "hello");
		insertType(a.getTxtPass(),"12345");
		
		/*
		 * WebElement user = driver.findElement(By.id("username"));
		 * user.sendKeys("John123"); WebElement pass =
		 * driver.findElement(By.id("password")); pass.sendKeys("1234567");
		 */
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		
		AdactinPagePojo a = new AdactinPagePojo();
		click(a.getBtnLogIn());
		/* driver.findElement(By.id("login")).click(); */
	}

	@Then("User validates the error message")
	public void user_validates_the_error_message() {
		WebElement authmsg = driver.findElement(By.xpath("//div[@class='auth_error']"));
		  Assert.assertTrue("Auth error msg is not displayed", authmsg.isDisplayed());
	}
	/*
	 * @When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"in hotel booking app$")
	 * public void
	 * user_enters_the_something_and_somethingin_hotel_booking_app(String userName,
	 * String password) throws Throwable {
	 * 
	 * WebElement user = driver.findElement(By.id("username"));
	 * user.sendKeys(userName); WebElement pass =
	 * driver.findElement(By.id("password")); pass.sendKeys(password);
	 * 
	 * 
	 * }
	 */
	
	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"in hotel booking app$")
	  public void user_enters_the_something_and_somethingin_hotel_booking_app(String userName, String password) throws Throwable {
		AdactinPagePojo a = new AdactinPagePojo();
		insertType(a.getTxtUserName(), userName);
		insertType(a.getTxtPass(),password);
	
	/*@When("User enters the {string} and {string}in hotel booking app")
	public void user_enters_the_and_in_hotel_booking_app(String userName, String password) {
	   WebElement user = driver.findElement(By.id("username"));
	   user.sendKeys(userName);
	   WebElement pass = driver.findElement(By.id("password"));
	   user.sendKeys(password);
	   */
	}




}
