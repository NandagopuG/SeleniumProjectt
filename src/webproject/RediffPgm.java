package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPgm {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	
	}
	
	@Test public void rediffPgm()
	{
		
		WebElement button=driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]"));
		String buttonName=button.getAttribute("value");
		if(buttonName.equals("Check availability"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	

}
