package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPgm {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
	}
	
	@Test
	public void amazonPgm()
	{
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phones",Keys.ENTER);
		
		String actualTitle=driver.getWindowHandle();
		String expectedTitle=driver.getWindowHandle();
		System.out.println("Window Title is " +driver.getTitle());
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title are same");
		}
			else
			{
				System.out.println("Title are not same");
		}
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allWindows=driver.getWindowHandles();
		for(String handle:allWindows)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		
		
		
	}

}
