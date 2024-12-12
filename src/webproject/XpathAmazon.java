package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test public void PageSource()
	{
		driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[2]/div[1]/div[1]/input")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	}
	@After public void tearDown()
	{
		driver.quit();
	}

}
