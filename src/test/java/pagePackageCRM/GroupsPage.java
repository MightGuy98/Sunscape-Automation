package pagePackageCRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupsPage 
{
	WebDriver driver;
	
	// groups
			@FindBy(xpath="//button[.//span[text()='Groups']]") WebElement grpBtn;
			@FindBy(xpath="//button[.//span[text()='+ Group']]")WebElement createGrp;
			@FindBy(xpath="//input[@placeholder='Group Name']")WebElement grpName;
			@FindBy(xpath="//textarea[@placeholder='Description']")WebElement G_description;
			@FindBy(xpath="//button[text()='Create']")WebElement createBtn;
			@FindBy(xpath="//div[text()='Redesign124']")WebElement groupClick;
			@FindBy(xpath="//button[.//span[text()='+ User']]") WebElement addUsertoGrp;
			@FindBy(xpath="//button[@aria-label='Open']")WebElement usermail;
			@FindBy(xpath="//div[text()='anjanaworkesr26@gmail.com']")WebElement addMail;
			@FindBy(xpath="//button[text()='Add']")WebElement addU;
			@FindBy(xpath="//a[text()='Redesign1300']")WebElement backBtn;
			@FindBy(xpath="(//button[@aria-label='more'])[4]")WebElement menuGrp;
			@FindBy(xpath="//li[text()='Delete']")WebElement deletegrp;
			@FindBy(xpath="//button[text()='Delete']")WebElement dltGrpBtn;
			public GroupsPage(WebDriver driver) 
			{

				this.driver=driver;
				PageFactory.initElements(driver,this);
				}
		
			
	public void groups() throws InterruptedException
	 {
	 	grpBtn.click();
	 	Actions act1=new Actions(driver);
	 	act1.moveToElement(createGrp).click().perform();
	 	Thread.sleep(2000);
	 	act1.moveToElement(grpName).click().sendKeys("New Group 100").perform();
	 	Thread.sleep(1000);
	 	act1.moveToElement(G_description).click().sendKeys("This is a redesign group").perform();
	 	createBtn.click();
	 	Thread.sleep(2000);
	 	act1.moveToElement(groupClick).doubleClick().perform();
	 	Thread.sleep(2000);
	 	act1.moveToElement(addUsertoGrp).click().perform();
	 	Thread.sleep(2000);
	 	act1.moveToElement(usermail).click().perform();
	 	Thread.sleep(1000);
	 	act1.moveToElement(addMail).sendKeys(Keys.ENTER).perform();
	 	addU.click();
	 	backBtn.click();
	 	act1.moveToElement(menuGrp).click().perform();
	 	Thread.sleep(2000);
	 	act1.moveToElement(deletegrp).click().perform();
	 	Thread.sleep(2000);
	 	act1.moveToElement(dltGrpBtn).click().perform();
	 }		
}
