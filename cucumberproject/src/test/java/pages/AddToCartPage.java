package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartPage
{  
	@FindBy(how =How.ID,using = "myInput")
	public static WebElement search;
	
	@FindBy(how = How.CSS,using = "input[type='submit']")
	public static WebElement find;
	
	@ FindBy(how = How.CSS,using = "a[class='btn btn-success btn-product']")
	public static WebElement addCart;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT,using = "Cart")
	public static WebElement cart;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT,using = "Checkout")
	public static WebElement checkoutbtn;
	
	@FindBy(how = How.CSS,using = "input[value='Proceed to Pay']")
	public static WebElement proceed_pay;
	
	@FindBy(how = How.XPATH,using = "//div[@id='swit'][2]/div[2]/div/label")
	public static WebElement hdfc;
	
	@FindBy(how = How.ID,using = "btn")
	public static WebElement con_btn;
	
	@FindBy(how = How.NAME,using = "username")
	public static WebElement Busername;
	
	@FindBy(how = How.NAME,using = "password")
	public static WebElement Bpwd;
	
	@FindBy(how = How.CSS,using = "input[value='LOGIN']")
	public static WebElement Bbtn;
	
	@FindBy(how = How.CSS,using = "input[type='password']")
	public static WebElement Tpwd;
	
	@FindBy(how = How.CSS,using = "input[value='PayNow']")
	public static WebElement Tbtn;
}
