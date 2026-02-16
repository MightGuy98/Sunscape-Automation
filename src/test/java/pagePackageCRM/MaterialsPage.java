package pagePackageCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaterialsPage 
{
WebDriver driver;
@FindBy(xpath="/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/div[4]/button")WebElement materialsOpt;
@FindBy(xpath="//button[.//span[contains(text(),'+ Type')]]")WebElement addtype;
@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div/form/div[1]/div[1]/div/div/div/input")WebElement MaterialName;
@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div/form/div[1]/div[2]/div/div/div/textarea[1]")WebElement MaterialDescription;
@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div/form/div[2]/button")WebElement submitMaterial;
@FindBy(xpath="//*[@id=\"long-button\"]")WebElement materialMenu; 
@FindBy(xpath="//li[@role='menuitem' and text()='Delete']")WebElement dltMaterial;
@FindBy(xpath="//div[contains(@class,'MuiDataGrid-scrollbar MuiDataGrid-scrollbar--horizontal css-2n9dey')]")WebElement scrollOpt;
@FindBy(xpath="//button[contains(text(),'Delete')]")WebElement MatdltOpt;
@FindBy(xpath="//button[contains(text(),'Cancel')]")WebElement cancel;
@FindBy(xpath="//div[@role='gridcell' and normalize-space()='Material']")WebElement openMaterial;
@FindBy(xpath="//button[.//span[text()='+ Material']]")WebElement addMaterial;
@FindBy(xpath="//input[@placeholder='Name']")WebElement nameMaterial;
@FindBy(xpath="//input[@placeholder='Base Price']")WebElement price;
@FindBy(xpath="//input[@placeholder='Unit of Measurement']")WebElement unit;
@FindBy(xpath="//textarea[@placeholder='Description']")WebElement Materialdescription;
@FindBy(xpath="//button[text()='Submit']")WebElement submitButton;


public MaterialsPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}

public void materialsClick()
{
driver.navigate().refresh();
materialsOpt.click();	
}
public void createMaterials() throws InterruptedException
{
	Actions act5=new Actions(driver);
	act5.moveToElement(addtype).click().perform();
	act5.moveToElement(MaterialName).click().sendKeys("Inverter 100").perform();
	Thread.sleep(500);
	act5.moveToElement(MaterialDescription).click().sendKeys("This is the description for Inverter ").perform();
	submitMaterial.click();
}
public void deleteMaterials() throws InterruptedException
{
	Actions act7=new Actions(driver);
   // driver.navigate().refresh();
    JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", scrollOpt);
    Thread.sleep(1000);
    materialMenu.click();
	Thread.sleep(1000);
	act7.moveToElement(dltMaterial).click().perform();
	Thread.sleep(1000);
	act7.moveToElement(MatdltOpt).click().perform();
	
//	Thread.sleep(2000);
//	cancel.click();
}
public void openMaterials() throws InterruptedException
{
Actions act6=new Actions(driver);
act6.moveToElement(openMaterial).doubleClick().perform();
act6.moveToElement(addMaterial).click().perform();
act6.moveToElement(nameMaterial).click().sendKeys(" New material two").perform();
act6.moveToElement(price).click().sendKeys("2000").perform();
act6.moveToElement(unit).click().sendKeys("mm").perform();
//act6.moveToElement(MaterialDescription).click().sendKeys("Description for matrial").perform();
Thread.sleep(1000);
act6.moveToElement(submitButton).click().perform();
}
}
