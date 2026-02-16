package pagePackageCRM;
 
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage 
{
	 
	 
	    WebDriver driver;
	 
	    @FindBy(xpath="//input[@placeholder=\"Email\"]") WebElement email;
	    @FindBy(xpath="//input[@placeholder=\"Password\"]")WebElement password;
	    @FindBy(xpath = "/html/body/div/div[2]/div[4]/div[1]/div/form/button")WebElement loginBtn;
	    @FindBy(xpath = "//button[text()=\"Sign In\"]")WebElement dashboardHeader;
	    public LoginPage(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	    public void openUrl(String url) 
	    {
	        driver.get(url);
	    }
	 
	    public void login(String user, String pass) 
	    {
	        email.clear();
	    	email.sendKeys(user);
	        password.clear();
	        password.sendKeys(pass);
	        loginBtn.click();
	        
	    }
	    public boolean isLoginSuccessful() {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        try
	        {
	            wait.until(ExpectedConditions.urlContains("/projects"));

	            String actualUrl = driver.getCurrentUrl();
	            System.out.println("Current URL after login: " + actualUrl);

	            return actualUrl.contains("/projects");

	        } catch (Exception e) 
	        {
	            System.out.println("Login failed or URL did not change");
	            return false;
	        }
	    }
	 

}
