package utilityPackageCRM;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotUtility 
{
   public static String capture(WebDriver driver, String name)
   {
	        String path = "./screenshots/" + name + ".png";
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
	            Thread.sleep(500);
	            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(src, new File(path));

	        } catch (Exception e) {
	            System.out.println("Screenshot capture failed: " + e.getMessage());
	        }

	        return path;
	    }
	}
