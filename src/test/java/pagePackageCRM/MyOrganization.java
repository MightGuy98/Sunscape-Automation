package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrganization 
{
	WebDriver driver;
	@FindBy(xpath="//a[.//span[text()='My Organization']]")WebElement MyorgBtn;
	
	
	public MyOrganization(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	public void myOrgClick()
	 {
	 MyorgBtn.click();	
	 }
	 
}
