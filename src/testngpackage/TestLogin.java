package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	@Test
	public void testLogin()
	{
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); 
		String expUrl=driver.getCurrentUrl();
		String actualUrl="https://practicetestautomation.com/logged-in-successfully/";
		Assert.assertEquals(expUrl, actualUrl);
		System.out.println("Pass");
	}

}
