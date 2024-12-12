package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		String exp="Google";
		Assert.assertEquals(exp, actualTitle);
		System.out.println("Hello");
	}

}
