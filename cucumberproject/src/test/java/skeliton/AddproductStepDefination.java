package skeliton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddProductPage;
import pages.AdminLoginPage;
import testmeappUtility.DriverUtility;

public class AddproductStepDefination 
{
	   WebDriver driver ;
	   @Before
	public  void before()
	{
		 driver = DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver, AdminLoginPage.class);
		 PageFactory.initElements(driver,AddProductPage.class);
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Given("the URL of TestMeApp")
	public void the_URL_of_TestMeApp() 
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("The admin enters login data")
	public void the_admin_enters_login_data()
	{
	   AdminLoginPage.username.sendKeys("admin");
	   AdminLoginPage.password.sendKeys("Password456");
	   AdminLoginPage.login_btn.click();
	   
	}

	@Then("admin is in Admin Home Page")
	public void admin_is_in_Admin_Home_Page() {
	  
	}

	@Given("clicks on add product")
	public void clicks_on_add_product() 
	{
		
	  AddProductPage.AddProduct_btn.click();
	}

	@When("fills data to add product")
	public void fills_data_to_add_product() 
	{
	   AddProductPage.CatogaryName.click();
	   AddProductPage.catogoryname();
	   AddProductPage.subcatogory.click();
	   AddProductPage.scatagory();
	   AddProductPage.productname.sendKeys("HP LAPTOP");
	   AddProductPage.price.sendKeys("70000");
	   AddProductPage.quantity.sendKeys("2");
	   AddProductPage.brand.sendKeys("HP");
	   AddProductPage.discription.sendKeys("FDHGVFJK");
	   AddProductPage.addpd_btn.click();
	}
	

	@Then("The Product sucessfully added")
	public void the_Product_sucessfully_added() {
	 
	}

}
