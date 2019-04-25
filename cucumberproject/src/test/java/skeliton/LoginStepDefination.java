package skeliton;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import testmeappUtility.DriverUtility;

public class LoginStepDefination {
	WebDriver driver;

	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_App() 
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	}

	@When("user enters {word} as username")
	public void user_enters_as_username(String string) {
		
    	driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enters {word} as password")
	public void user_enters_as_password(String string) 
	{
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("user is in (Home|Admin Home)")
	public void user_is_in_home_page() {
		driver.findElement(By.name("Login")).click();
		String title = driver.getTitle();
		Assert.assertTrue( title.contains("Home"));
	}
	@When("user enters invalid data")
	public void user_enters_invalid_data(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists();
		for(List<String> list2:list)
		{
			for(String s :list2)
			{
				System.out.print(s+ "\t");
			}
			System.out.println(" ");
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@Then("user is in login page")
	public void user_is_in_login_page(List<String> s)
	{
	    for(String as :s)
	    {
	    	System.out.println(as);
	    }
	}




}
