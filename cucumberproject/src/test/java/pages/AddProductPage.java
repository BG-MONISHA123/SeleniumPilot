package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddProductPage
{ 
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[1]/button")
	public static WebElement AddProduct_btn;
	
	@FindBy(how=How.ID,using = "categorydropid")
	public static WebElement CatogaryName;
	 
	public static void catogoryname()
	{
		Select catagory = new Select(CatogaryName);
		catagory.selectByValue("11290");
	    
	}
	
	@FindBy(how=How.ID,using = "subcategorydropid")
	 public static WebElement subcatogory;
	
	public static void scatagory()
	{
		Select sa = new Select(subcatogory);
		sa.selectByValue("112112");
	}
	
	@FindBy(how=How.ID,using = "prodid")
    public static WebElement productname ;
	
	@FindBy(how = How.ID,using = "priceid")
	public static WebElement price;
	
	@FindBy(how=How.ID,using = "quantityid")
	public static WebElement quantity ;
	
	@FindBy(how=How.ID,using="brandid")
	public static WebElement brand ;
    
	@FindBy(how=How.ID,using = "description")
	public static WebElement discription;
	
	@FindBy(how=How.CSS,using="input[type='submit']")
	public static WebElement addpd_btn;
}   
