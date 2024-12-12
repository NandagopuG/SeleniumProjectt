package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertion {
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
		String exp="google";
		if(exp.equals(actualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println("Hello");
	}

}
