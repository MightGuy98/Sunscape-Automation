package pagePackageCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChecklistPage 
{
WebDriver driver;
public ChecklistPage(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[.//span[text()='Check list']]")WebElement checklist;
@FindBy(xpath="//p[text()='Permit and Utility Onboarding Intake Sheet']")WebElement permit;
@FindBy(xpath="//input[@name='posPerAssi']")WebElement q1;
@FindBy(xpath="//input[@name='posPrjVolume']")WebElement q2;
@FindBy(xpath="//input[@type='file']")WebElement fileInput;
@FindBy(xpath="//button[text()='Submit']")WebElement submit;
@FindBy(xpath="//input[@type='file']")WebElement q3;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;
//@FindBy(xpath="")WebElement;



@FindBy(xpath="//p[text()='Contractor Registration Onboarding Requirements']")WebElement contract;
public void checklistClick()
{
checklist.click();	
}
public void permit()
{
//	permit.click();
//	q1.sendKeys("yes");
//	q2.sendKeys("abcd");
	
	


	    checklist.click();

	    permit.click();

	    q1.clear();
	    q1.sendKeys("yes");
	    q1.sendKeys(Keys.TAB);

	    q2.clear();
	    q2.sendKeys("abcd");
	    q2.sendKeys(Keys.TAB);

//	    q3.sendKeys("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
//
//	    new WebDriverWait(driver, Duration.ofSeconds(15))
//	        .until(ExpectedConditions.visibilityOf(uploadedFile));
//
//	    new WebDriverWait(driver, Duration.ofSeconds(10))
//	        .until(ExpectedConditions.elementToBeClickable(submit));
//
//	    submit.click();
	

	
}
public void uploadAndSubmitChecklist() {

    // 1️⃣ Open upload dialog via React component
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", q3);

    // 2️⃣ Attach file to hidden input
    q3.sendKeys("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");

    // 3️⃣ Wait for UI confirmation
//    new WebDriverWait(driver, Duration.ofSeconds(20))
//        .until(ExpectedConditions.visibilityOf(uploadedFileName));

    // 4️⃣ Submit
    new Actions(driver).moveToElement(submit).click().perform();
}

//public void robotcls() throws AWTException, InterruptedException
//{
//	q3.click();
//	fileupload1("C:\\Users\\kanjana\\Downloads\\BOM (13).pdf");
//	Thread.sleep(1000);
//	submit.click();
//	
//}
//public void fileupload1(String fp) throws AWTException
//{
//StringSelection str=new StringSelection(fp);
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//Robot ob=new Robot();
//ob.keyPress(KeyEvent.VK_CONTROL);
//ob.keyPress(KeyEvent.VK_V);
//ob.keyRelease(KeyEvent.VK_V);
//ob.keyRelease(KeyEvent.VK_CONTROL);
//ob.delay(2000);
//ob.keyPress(KeyEvent.VK_ENTER);
//ob.keyRelease(KeyEvent.VK_ENTER);
//ob.delay(2000);
//}
}
