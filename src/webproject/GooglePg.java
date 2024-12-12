package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePg {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test public void googleSearch()
	{
		driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	}

}
