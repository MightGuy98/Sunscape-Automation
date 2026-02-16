package basePackage;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilityPackageCRM.ScreenshotUtility;

public class BaseClassCRM 
{
	public static boolean isLoginSuccessful = false;
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeTest(alwaysRun = true)
    public void reportSetup() 
    {
        ExtentSparkReporter reporter =new ExtentSparkReporter("./testreports/SunscapeReport.html");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    @BeforeClass
    public void browserSetup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod(alwaysRun = true)
    public void createTest(Method method) 
    {
        test = extent.createTest(method.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void captureResult(ITestResult result) 
    {
        try 
        {
            if (result.getStatus() == ITestResult.FAILURE) 
            {

                String path = ScreenshotUtility.capture(driver, result.getName());
                test.fail("Test Failed : " + result.getName());
                test.fail(result.getThrowable());
                test.addScreenCaptureFromPath(path);

            } else if (result.getStatus() == ITestResult.SUCCESS) 
            {

                test.pass("Test Passed : " + result.getName());

            } else if (result.getStatus() == ITestResult.SKIP) 
            {

                test.skip("Test Skipped : " + result.getName());
            }

        } catch (Exception e)
        {
            System.out.println("Reporting error: " + e.getMessage());
        }
    }

    @AfterTest(alwaysRun = true)
    public void teardown() 
    {
        extent.flush();

//        if (driver != null) 
//        {
//            driver.quit();
//        }
    }
}
