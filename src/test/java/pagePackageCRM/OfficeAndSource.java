package pagePackageCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfficeAndSource 
{
    WebDriver driver;
    @FindBy(xpath="//button[.//span[text()='Office & Source']]")WebElement OfficeSource;
	@FindBy(xpath="//button[contains(text(),'Office')]")WebElement officeAndSource;
	@FindBy(xpath="//button[.//span[text()='+ Office']]")WebElement createOffice;
	@FindBy(xpath="//input[@placeholder=\"Office Name\"]")WebElement offName;
	@FindBy(xpath="//button[text()=\"Save\"]")WebElement saveBtn;
	@FindBy(xpath="//button[@aria-label='more']")WebElement menuOf;
	@FindBy(xpath="//li[text()='Delete']")WebElement delete;
	@FindBy(xpath="//button[text()='Delete']")WebElement deletebtn;
	@FindBy(xpath="//button[text()='Source']")WebElement sourceopt;
	@FindBy(xpath="//button[.//span[text()='+ Source']]") WebElement addSource;
	@FindBy(xpath="//input[@placeholder='Source Name']")WebElement sourceName;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	@FindBy(xpath="//button[@aria-label='more']")WebElement sMenu;
	@FindBy(xpath="//li[text()='Delete']")WebElement dltsource;
	@FindBy(xpath="//button[text()='Delete']")WebElement dltSourceOpt;
	public OfficeAndSource(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOffice()
	{
		driver.navigate().refresh();
		OfficeSource.click();
	}
	public void createOffice()
	{
		createOffice.click();
		offName.sendKeys("office 203");
		saveBtn.click();
	}
	public void deleteOffice()
	{
		menuOf.click();
		delete.click();
		deletebtn.click();
	}
	public void createsource() throws InterruptedException
	{   driver.navigate().refresh();
		sourceopt.click();
		addSource.click();
		sourceName.sendKeys("source 203");
		save.click();
	}
	public void deleteSource()
	{
		driver.navigate().refresh();
		sourceopt.click();
		menuOf.click();
		dltsource.click();
		dltSourceOpt.click();
		
	}
	
	
}
