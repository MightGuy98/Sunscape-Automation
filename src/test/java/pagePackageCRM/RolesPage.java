package pagePackageCRM;

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

public class RolesPage 
{
WebDriver driver;
@FindBy(xpath="//button[.//span[text()='Roles']]")WebElement roles;
@FindBy(xpath="//button[.//span[text()='+ Add Role']]")WebElement addrole;
@FindBy(xpath="//input[@name='name']")WebElement roleNme;
@FindBy(xpath="//textarea[@name='description']")WebElement description;
@FindBy(xpath="//button[text()='Save']")WebElement save;
@FindBy(xpath="//button[@aria-label='more']")WebElement menu;
@FindBy(xpath="//li[text()='Delete']")WebElement delete;
@FindBy(xpath="//button[text()='Ok']")WebElement okBtn;
@FindBy(xpath="//p[text()='MODERATOR']/ancestor::div[@role='row']")WebElement clickrole;
@FindBy(xpath="//button[.//span[text()='+ Add']]")WebElement addUser;
@FindBy(xpath="//input[@id='combo-box-demo-groupId']")WebElement grp;
@FindBy(xpath="//button[@title='Open']")WebElement menu2;
@FindBy(xpath="//div[text()='Gokul - Krishna']")WebElement user;
@FindBy(xpath="//button[text()='Save']")WebElement saveBtn;
@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1xeia1z']")WebElement close;
public RolesPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
public void clickRole()
{
	roles.click();
}
public void createRole()
{
	addrole.click();
	roleNme.sendKeys("New reDesign");
	description.sendKeys("Description for this role");
	save.click();
}
public void deleterole()
{
menu.click();
delete.click();
okBtn.click();
}
public void aduser() throws InterruptedException
{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    Actions act = new Actions(driver);
    clickrole.click();
    Thread.sleep(1000);
    wait.until(ExpectedConditions.elementToBeClickable(addUser)).click();
    wait.until(ExpectedConditions.elementToBeClickable(grp)).click();
    wait.until(ExpectedConditions.elementToBeClickable(menu2)).click();
    wait.until(ExpectedConditions.visibilityOf(user)).sendKeys(Keys.ENTER);
    wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    driver.navigate().refresh();
   // act.moveToElement(close).click().perform();
}

}
