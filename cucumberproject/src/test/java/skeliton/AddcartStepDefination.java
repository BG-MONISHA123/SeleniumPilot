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

import pages.AddToCartPage;
import pages.AdminLoginPage;
import testmeappUtility.DriverUtility;

public class AddcartStepDefination
{
	
	WebDriver driver ;
	   @Before
		public  void before()
		{
			 driver = DriverUtility.getDriver("chrome");
			 PageFactory.initElements(driver, AdminLoginPage.class);
			 PageFactory.initElements(driver,AddToCartPage.class );
			 driver.manage().window().maximize();	
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
	
	
	@Given("user login select product")
	public void user_login_select_product()
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 AdminLoginPage.username.sendKeys("Lalitha");
		   AdminLoginPage.password.sendKeys("Password123");
		   AdminLoginPage.login_btn.click();
		   AddToCartPage.search.sendKeys("wear");
		   AddToCartPage.find.click();
		  
	   
	}
	@When("Lalitha added a wear to the cart")
	public void lalitha_added_a_wear_to_the_cart()
	{
		 AddToCartPage.addCart.click();
		 AddToCartPage.cart.click();
		 
	   
	}

	@When("checkout for payment")
	public void checkout_for_payment()
	{
	  AddToCartPage.checkoutbtn.click();
	  AddToCartPage.proceed_pay.click();
	}

	@When("fills transaction details")
	public void fills_transaction_details() 
	{
	   AddToCartPage.hdfc.click();
	   AddToCartPage.con_btn.click();
	   AddToCartPage.Busername.sendKeys("123457");
	   AddToCartPage.Bpwd.sendKeys("Pass@457");
	   AddToCartPage.Bbtn.click();
	   AddToCartPage.Tpwd.sendKeys("Trans@457");
	   AddToCartPage.Tbtn.click();
	}

	@Then("the product is succesfully ordered")
	public void the_product_is_succesfully_ordered() 
	{
	String text = driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]")).getText();
	Assert.assertTrue(text.contains("Your order has been confirmed"));
	}

}
