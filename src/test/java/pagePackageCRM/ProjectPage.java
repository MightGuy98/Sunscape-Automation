package pagePackageCRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage 
{
	WebDriver driver;
	public ProjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[.//span[text()='Projects']]")WebElement prjClick;
@FindBy(xpath="//p[text()='Anjana K K']")WebElement prj;
@FindBy(xpath="//button[text()='Add Multiple Stages']")WebElement addMultiStg;
@FindBy(xpath="(//span[.//input[@name='gilad']])[2]")WebElement stg1;
@FindBy(xpath="(//span[.//input[@name='gilad']])[3]")WebElement stg2;
@FindBy(xpath="(//span[.//input[@name='gilad']])[4]")WebElement stg3;
@FindBy(xpath="(//button[text()='Save'])[2]")WebElement saveStg;
@FindBy(xpath="(//button[@aria-label='more'])[1]")WebElement StgMenu;
@FindBy(xpath="//li[text()='Mark as completed']")WebElement markAsCmplt;
@FindBy(xpath="//button[text()='Ok']")WebElement ok;
@FindBy(xpath="(//button[@aria-label='more'])[2]")WebElement StgMenu2;
@FindBy(xpath="//li[text()='Remove']")WebElement removeOpt;
@FindBy(xpath="//button[text()='Remove']")WebElement removeBtn;
@FindBy(xpath="//textarea[@name='comment']")WebElement cmnt;
@FindBy(xpath="//li[.//p[text()='Anjana k k']]")WebElement mentionName;
@FindBy(xpath="//button[text()='Save']")WebElement CmntSave;
@FindBy(xpath="(//button[@aria-label='delete'])[4]")WebElement deleteCmnt;
@FindBy(xpath="//button[text()='Delete']")WebElement dltBtn;
@FindBy(xpath="(//button[@aria-label='reply'])[1]")WebElement rply;
@FindBy(xpath="(//textarea[@placeholder='Enter your Reply...'])[1]")WebElement cmntRply;
@FindBy(xpath="(//button[text()='Save'])[1]")WebElement rplysave;
@FindBy(xpath="//button[.//div[text()='All Comments']]")WebElement allCmnts;
//call
@FindBy(xpath="//button[.//div[text()='Call']]")WebElement call;
@FindBy(xpath="//button[text()='Call']")WebElement addcall;
@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeLarge css-u4ctu6'])[1]")WebElement chooseUser;
//email
@FindBy(xpath="//button[.//div[text()='Email']]")WebElement emailSec;
@FindBy(xpath="//button[text()='Mail']")WebElement mail;
@FindBy(xpath="//button[@aria-label='Open']")WebElement toMenu;
@FindBy(xpath="//p[.//small[text()='kanjana@energyscaperenewables.com']]")WebElement toMail;
@FindBy(xpath="//input[@name='subject']") WebElement subject;
@FindBy(xpath="//div[@class='ql-editor ql-blank']")WebElement content;
@FindBy(xpath="//button[text()='Send']")WebElement send;

//SMS
@FindBy(xpath="//button[.//div[text()='SMS']]")WebElement smsOpt;
@FindBy(xpath="//button[text()='SMS']")WebElement addsms;
@FindBy(xpath="//button[@title='Open']")WebElement toUsermenu;
@FindBy(xpath="//li[@id='combo-box-demo-toNumber-option-1']")WebElement SmsUser;
@FindBy(xpath="//textarea[@placeholder='Type here']") WebElement msgBody;
@FindBy(xpath="//button[text()='Send']")WebElement sendMsg;

//appointments
@FindBy(xpath="//button[.//div[text()='Appointments']]")WebElement appointmentOpt;
@FindBy(xpath="//button[text()='Add New']")WebElement addnew;
@FindBy(xpath="(//button[@title='Open'])[1]")WebElement typeMenu;
@FindBy(xpath="//div[text()='Appointment']")WebElement type1;
@FindBy(xpath="(//button[@title='Open'])[2]")WebElement stMenu;
@FindBy(xpath="(//div[text()='NEW'])[2]")WebElement stStg;
@FindBy(xpath="//input[@name='subject']")WebElement title;
@FindBy(xpath="(//label[.//span[@class='greenmark']])[2]")WebElement online;
@FindBy(xpath="//button[text()='Save']")WebElement saveA;

public void prjClick()
{
	prjClick.click();
}
public void openProject()
{
	prj.click();
}
public void addStages() throws InterruptedException
{
	addMultiStg.click();
	stg1.click();
	stg2.click();
	stg3.click();
	Actions act1=new Actions(driver);
	act1.moveToElement(saveStg).click().perform();
	Thread.sleep(2000);
}

public void comment() throws InterruptedException
{
Actions act=new Actions(driver);
Thread.sleep(2000);
act.moveToElement(cmnt).sendKeys("@A").click().perform();
Thread.sleep(2000);
mentionName.click();
cmnt.sendKeys("comment 2");
CmntSave.click();
act.moveToElement(rply).click().sendKeys("Reply test").perform();
rplysave.click();
allCmnts.click();
}
public void dltComment()
{
deleteCmnt.click();	
dltBtn.click();

}
public void stgremove()
{
	StgMenu2.click();
	markAsCmplt.click();
	ok.click();
}
public void callOption()
{
call.click();	
addcall.click();
chooseUser.click();
}
public void emailOption() throws InterruptedException
{
Thread.sleep(2000);
emailSec.click();	
mail.click();
toMenu.click();
Actions act2=new Actions(driver);
act2.moveToElement(toMail).click().perform();
subject.sendKeys("This is the subject for email verifications");
content.sendKeys("Email content");
send.click();
}
public void smsOption() throws InterruptedException
{
Thread.sleep(2000);
smsOpt.click();
addsms.click();
toUsermenu.click();
SmsUser.click();
msgBody.sendKeys("SMS Test 1");
sendMsg.click();
}
public void appointments() throws InterruptedException
{
Thread.sleep(2000);
appointmentOpt.click();
addnew.click();
typeMenu.click();
type1.click();
stMenu.click();
stStg.click();
title.sendKeys("New appointment 1");
online.click();
saveA.click();

}
}
