package skeliton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;
import testmeappUtility.DriverUtility;

public class RegistrationStepDefinations 
{
	WebDriver driver ;
	
	@Given("URL for demowebshop")
	public void url_for_demowebshop() {
		driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters data for registration")
	public void user_enters_data_for_registration() {
		  RegisterPage.gender.click();
		  RegisterPage.firstname.sendKeys("moni");
		  RegisterPage.lastname.sendKeys("bg");
		  RegisterPage.email.sendKeys("monisha222678@gmail.com");
		  RegisterPage.password.sendKeys("123456789");
		  RegisterPage.confirmpassword.sendKeys("123456789");
		  RegisterPage.registerbutton.click();
		  
	  	}

	@Then("user registered sucessfully")
	public void user_registered_sucessfully() 
	{
		String text = driver.findElement(By.cssSelector("div[class='result']")).getText();
		Assert.assertTrue(text.contains("Your registration completed"));
	   
	}

}
