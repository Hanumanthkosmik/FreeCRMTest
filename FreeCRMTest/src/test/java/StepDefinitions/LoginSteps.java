package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	 @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        // Navigate to login page
			driver = new FirefoxDriver();
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			
	    }

	    @When("I enter the valid credentials")
	    public void i_enter_the_valid_credentials() {
	        // Code to enter credentials
			driver.findElement(By.name("txtUserName")).sendKeys("selenium");	
			driver.findElement(By.name("txtPassword")).sendKeys("selenium");
			driver.findElement(By.name("Submit")).click();

	    }

	    @Then("I should be redirected to dashboard or welcome page")
	    public void i_should_be_redirected_to_dashboard_or_welcome_page() {
	        // Code to verify redirection
			String  currentPageUrl = driver.getCurrentUrl();//
			
			 System.out.println("currentPageUrl : "+currentPageUrl);
			 
			 Assert.assertEquals(currentPageUrl,"http://127.0.0.1/orangehrm-2.5.0.2/index.php");
			
	    }
	    
	    @When("I enter the invalid credentials")
	    public void I_enter_the_invalid_credentials() {
	    	
	    	// Code to enter credentials
			driver.findElement(By.name("txtUserName")).sendKeys("selenium");	
			driver.findElement(By.name("txtPassword")).sendKeys("seleniu");
			driver.findElement(By.name("Submit")).click();
	    }
	    
	    @Then("I should see an error message")
	    public void I_should_see_an_error_message() {
	    	
	    String	errorMessage = driver.findElement(By.xpath("//font[text()='Invalid Login']")).getText();
	    	
	    	Assert.assertTrue(errorMessage.contains("Invalid Login"));
	    	
	    }

	    @And("close the browser")
	    public void close_the_browser() {
	        // Code to close the browser
			driver.close();
	    }
	
}
