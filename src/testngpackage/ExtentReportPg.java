package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportPg {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	String baseUrl="https://www.facebook.com/";
	
	@BeforeTest
	public void extentReport()
	{
		reporter=new ExtentHtmlReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("host name","local host");
		extent.setSystemInfo("OS","Windows 10");
		extent.setSystemInfo("Tester name", "Gopu");
		extent.setSystemInfo("browser name", "Chrome");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void befMthd()
	{
		driver.get(baseUrl);
	}
	@Test
	public void titleVerification()
	{
		test=extent.createTest("Fb title verification");
		String actualTitle=driver.getTitle();
		String exp="Facebook - log in  or  sign up";
		AssertJUnit.assertEquals(exp, actualTitle);
	}
	
	@Test
	public void fbLogotest()
	{
		test=extent.createTest("Fb Logo verification");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
		AssertJUnit.assertTrue(b);
	}
	@AfterTest
	public void tearDown()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserClose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is " +result.getName());
			test.log(Status.FAIL, "test case failed is " +result.getThrowable());			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is " +result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is " +result.getName());
		}
	}
	

}
