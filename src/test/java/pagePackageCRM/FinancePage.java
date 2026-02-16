package pagePackageCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancePage 
{

	WebDriver driver;
	public FinancePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[.//span[text()='Finance']]")WebElement finance;
	@FindBy(xpath="//button[.//span[text()='+ Create']]")WebElement createFinance;
	@FindBy(xpath="//input[@placeholder='Finance Type']")WebElement financeType;
	@FindBy(xpath="//input[@placeholder='Address']")WebElement Address;
	@FindBy(xpath="//input[@placeholder='Email ID']")WebElement email;
	@FindBy(xpath="//input[@placeholder='Mobile Number']")WebElement phno;
	@FindBy(xpath="//button[@aria-label='Open']")WebElement milestoneMenu;
	@FindBy(xpath="//div[text()='2']")WebElement milestoneCount;
	@FindBy(xpath="(//input[@placeholder='Percentage'])[1]")WebElement Milestone1percentage;
	@FindBy(xpath="(//button[@aria-label='Open'])[2]")WebElement stagemenu;
	@FindBy(xpath="//div[text()='NEW']")WebElement stage;
	@FindBy(xpath="(//button[@aria-label='Open'])[3]")WebElement userMenu;
	@FindBy(xpath="(//div[text()='Anjana k k'])[2]")WebElement user;
	@FindBy(xpath="(//button[@aria-label='Open'])[4]")WebElement groupMenu;
	@FindBy(xpath="//div[text()='Design']")WebElement group;
	@FindBy(xpath="(//input[@placeholder='Percentage'])[2]")WebElement Milestone2Percentage;
	@FindBy(xpath="(//button[@aria-label='Open'])[5]")WebElement stagemenu2;
	@FindBy(xpath="//div[text()='NEW']")WebElement stage2;
	@FindBy(xpath="(//button[@aria-label='Open'])[6]")WebElement usermenu2;
	@FindBy(xpath="(//div[text()='Anjana k k'])[3]")WebElement user2;
	@FindBy(xpath="(//button[@aria-label='Open'])[7]")WebElement groupmenu2;
	@FindBy(xpath="//div[text()='Design']")WebElement group2;
	@FindBy(xpath="//button[text()='Submit']")WebElement submit;
	@FindBy(xpath="//div[@class='MuiBox-root css-1c6gta1']")WebElement scroll;
	@FindBy(xpath="//button[@id=\"long-button\"]")WebElement Dltmenu;
	@FindBy(xpath="//li[@role='menuitem' and text()='Delete']")WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Delete')]")WebElement deleteOpt;
	public void createfinance() throws InterruptedException
	{
		finance.click();
		Actions act=new Actions(driver);
		act.moveToElement(createFinance).click().perform();
		financeType.sendKeys("HDFC new");
		Address.sendKeys("HDFC 01 Bank");
		email.sendKeys("hdfc01@gmail.com");
		phno.sendKeys("4767800950");
		act.moveToElement(milestoneMenu).click().perform();
		Thread.sleep(1000);
		act.moveToElement(milestoneCount).click().sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		Milestone1percentage.sendKeys("50");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scroll);
		act.moveToElement(stagemenu).click().perform();
		act.moveToElement(stage).click().sendKeys(Keys.ENTER).perform();
		userMenu.click();
		act.moveToElement(user).sendKeys(Keys.ENTER).perform();
		groupMenu.click();
		act.moveToElement(group).click().perform();
		Milestone2Percentage.sendKeys("50");
		act.moveToElement(stagemenu2).click().perform();
		act.moveToElement(stage2).sendKeys(Keys.ENTER).perform();
		submit.click();
	}
	public void deleteFinance() throws InterruptedException
	{
		Dltmenu.click();
		delete.click();
		Thread.sleep(1000);
		deleteOpt.click();
	}
	
	
}
