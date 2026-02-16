package pagePackageCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage 
{

	WebDriver driver;

	//users
		@FindBy(xpath="//button[.//span[text()='Users']]")WebElement useropt;
		@FindBy(xpath="//button[.//span[text()='+ Invite']]")WebElement invite;
		@FindBy(xpath="//input[@placeholder='Member Email']")WebElement memberEmail;
		@FindBy(xpath="(//button[@title='Open'])[1]")WebElement group;
		@FindBy(xpath ="//div[text()='Design']")WebElement grpOpt;
		@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/button[1]")WebElement rolebackBtn;
		@FindBy(xpath="(//button[@aria-label='Open'])[2]")WebElement roleBtn;
		@FindBy(xpath="//div[text()='MODERATOR']")WebElement roleOpt;
		@FindBy(xpath="//button[text()='Send']")WebElement send;
		//@FindBy(xpath="//div[@class='MuiDataGrid-scrollbar MuiDataGrid-scrollbar--horizontal css-2n9dey']")WebElement scroll;
		@FindBy(xpath="MuiDataGrid-scrollbar MuiDataGrid-scrollbar--horizontal css-2n9dey")WebElement scroll;
		
		@FindBy(xpath="//button[@aria-label='more']")WebElement menulist;
		@FindBy(xpath="//button[text()='All']")WebElement All;
		@FindBy(xpath="//button[text()='Invites']")WebElement inviteBtn;
		@FindBy(xpath="//button[text()='Suspended Users']")WebElement suspendUserOpt;
		@FindBy(xpath="//button[@aria-label='more']")WebElement sMenu;
		
		@FindBy(xpath="//li[text()='Suspend User']")WebElement suspenduser;
		@FindBy(xpath="//button[@aria-label='Open']")WebElement suspendOpt;
		@FindBy(xpath="//div[text()='Policy Violation']")WebElement suspendreason;
		@FindBy(xpath="//textarea[@placeholder='Additional Info']")WebElement additionalInfo;
		@FindBy(xpath="//button[.//span[text()='Suspend']]")WebElement suspendBtn;
		@FindBy(xpath="//button[@aria-label='more']")WebElement menu;
		@FindBy(xpath="//li[text()='Delete']")WebElement deleteUser;
		@FindBy(xpath="//button[text()='Delete']")WebElement deleteBtn;
		
		
		 
		public UsersPage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		
		 public void users(String email) throws InterruptedException
		 {
		  Thread.sleep(1000);
		  System.out.println( useropt.getText());
		  invite.click();
		  Thread.sleep(1000);
		  memberEmail.sendKeys(email);
		  group.click();
		  Actions act=new Actions(driver);
		  act.moveToElement(grpOpt).click().perform(); 
		  roleBtn.click();
		  Thread.sleep(1000);
		  act.moveToElement(roleOpt).click().perform();
	      send.click();	 		  
		 }
		
		 public void Userremaining() throws InterruptedException
		 {	  
		  Actions act1=new Actions(driver);
		  Thread.sleep(2000);
		  inviteBtn.click();
		  Thread.sleep(2000);
		  All.click();
//		  JavascriptExecutor js=(JavascriptExecutor)driver;
//		  js.executeScript("arguments[0].scrollRight = arguments[0].scrollWidth;", scroll);
//		  act1.moveToElement(menu).click().perform();
//		  Thread.sleep(500);
		  act1.moveToElement(scroll).keyDown(org.openqa.selenium.Keys.SHIFT).scrollByAmount(2000, 0).keyUp(org.openqa.selenium.Keys.SHIFT).perform();
		  deleteUser.click();
		  Thread.sleep(500);
		  deleteBtn.click();
		 
}
}
