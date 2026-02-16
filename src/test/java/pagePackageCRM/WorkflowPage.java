package pagePackageCRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkflowPage 
{
	WebDriver driver;
	public WorkflowPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
		
		@FindBy(xpath="//button[.//span[text()='Work flow']]")WebElement workflowOpt;
		//@FindBy(xpath="//button[text()='Stages']")WebElement addStages;
		
		@FindBy(xpath="//button[.//span[text()='+ Stages']]")WebElement addStages;
		@FindBy(xpath="//input[@value='Internal']")WebElement internal;
		@FindBy(xpath="//input[@placeholder='Name']")WebElement name;
		@FindBy(xpath="//input[@placeholder='Rotting Time(In Days)']")WebElement rottingTime;
		@FindBy(xpath="//button[text()='Save & Next']")WebElement saveNext;
		@FindBy(xpath="//button[@aria-label='Open']")WebElement chkfileMenu;
		@FindBy(xpath="//div[text()='Text']")WebElement fileTypeBtn;
		@FindBy(xpath="//input[@placeholder='Field Label']")WebElement fieldType;
		@FindBy(xpath="//button[text()='Submit']")WebElement submit;
		@FindBy(xpath="//span[@title='new Redesign09']")WebElement wrk;
		@FindBy(xpath="(//button[@aria-label='more'])[5]")WebElement wrkMenu;
		@FindBy(xpath="//li[text()='Delete']")WebElement wrkDelete;
		@FindBy(xpath="//button[text()='Delete']")WebElement wrkDltOpt;
		@FindBy(xpath="//button[@aria-label='Auto Assignments']")WebElement autoAssignment;
		@FindBy(xpath="//div//span[@title='NEW']")WebElement wrkflowclick;
		@FindBy(xpath="//button[.//div[text()='Status']]")WebElement status;
		@FindBy(xpath="//button[text()='Status']")WebElement addStatus;
		@FindBy(xpath="//input[@placeholder='Name']")WebElement StatusName;
		@FindBy(xpath="//button[text()='Add Status']")WebElement addStatusBtn;
		@FindBy(xpath="//button[@aria-label='more']")WebElement statusMenu;
		@FindBy(xpath="//li[text()='Delete']")WebElement dltStatus;
		@FindBy(xpath="//button[text()='Delete']")WebElement dltStOpt;
		@FindBy(xpath="//button[.//div[text()='Check list']]")WebElement checklist;
		@FindBy(xpath="//button[text()='Checklist']")WebElement addChkList;
		@FindBy(xpath="//button[@aria-label='Open']")WebElement filemenu;
		@FindBy(xpath="//div[text()='Text']")WebElement Chkfiletype;
		@FindBy(xpath="//input[@placeholder='Field Label']")WebElement fieldlabel;
		@FindBy(xpath="//button[text()='Submit']")WebElement chkSubmit;
		@FindBy(xpath="//*[@id=\"long-button\"]")WebElement chkMenu;
		@FindBy(xpath="//li[text()='Delete']")WebElement chkDltOpt;
		@FindBy(xpath="//button[text()='Delete']") WebElement chkDlt;
		@FindBy(xpath="//span[@title='new Redesign0']")WebElement stg;
		public void workflowclick()
		{
		workflowOpt.click();
		}
		public void workflowCreation() throws InterruptedException
		{
		Actions act2=new Actions(driver);
		Thread.sleep(1000);
		addStages.click();
		internal.click();
		Thread.sleep(1000);
		act2.moveToElement(name).click().sendKeys("New design").perform();
		Thread.sleep(1000);
		act2.moveToElement(rottingTime).click().sendKeys("3").perform();
		Thread.sleep(2000);
		act2.moveToElement(saveNext).click().perform();
		Thread.sleep(1000);
		chkfileMenu.click();
		act2.moveToElement(fileTypeBtn).click().sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act2.moveToElement(fieldType).click().sendKeys("New design Checklists").perform();
		Thread.sleep(1500);
		submit.click();
     	driver.navigate().refresh();
		}
		public void deleteworkflow() throws InterruptedException
		{
	    driver.navigate().refresh();
		Actions act3=new Actions(driver);
		//act3.moveToElement(stg).perform();
		act3.click(wrkMenu).perform();
		
		
		Thread.sleep(1000);
		act3.moveToElement(wrkDelete).click().perform();
		Thread.sleep(1000);
		act3.moveToElement(wrkDltOpt).click().perform();
		Thread.sleep(2000);
		}
		public void openworkflow() throws InterruptedException
		{
		Actions act4=new Actions(driver);
		act4.moveToElement(wrkflowclick).doubleClick().perform();
		Thread.sleep(2000);
		act4.moveToElement(status).click().perform();
		addStatus.click();
		act4.moveToElement(StatusName).click().sendKeys("New design 210").perform();
		Thread.sleep(2000);
		act4.moveToElement(addStatusBtn).click().perform();
		Thread.sleep(2000);
		act4.moveToElement(statusMenu).click().perform();
		Thread.sleep(1000);
		act4.moveToElement(dltStatus).click().perform();
		Thread.sleep(1000);
		act4.moveToElement(dltStOpt).click().perform();
		Thread.sleep(500);
		act4.moveToElement(checklist).click().perform();
		addChkList.click();
		filemenu.click();
		act4.moveToElement(Chkfiletype).click().sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act4.moveToElement(fieldlabel).click().sendKeys("new design Checklists one 30").perform();
		act4.moveToElement(chkSubmit).click().perform();
		Thread.sleep(1000);
		act4.moveToElement(chkMenu).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		act4.moveToElement(chkDltOpt).click().perform();
		act4.moveToElement(chkDlt).click().perform();

}
}
