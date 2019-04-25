package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public  class AdminLoginPage 
{
	@FindBy(how=How.ID,using = "userName")
    public static WebElement username;
	
	@FindBy(how=How.ID,using = "password")
	 public static WebElement password;
	
	@FindBy(how=How.CSS,using = "input[type='submit']")
	 public static WebElement login_btn;
	
}
