package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Facebook";
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title are same");
		}
			else
		{
				System.out.println("Title are not same");
		}
	}
		@After public void tearDown()
		{
			driver.quit();
		}
	}



