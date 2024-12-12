package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	@Test public void ebaySearch()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Ebay.com";
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title are same");
		}
			else
		{
				System.out.println("Title are not same");
		}
		
		
		
		driver.findElement(By.id("gh-shop-a")).click();
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Art/550/bn_1853728']")).click();
		
		String src=driver.getPageSource();
		if(src.contains("SHOP BY CATEGORY"))
		{
			System.out.println("Content present");
		}
		else
		{
			System.out.println("Content not present");
		}
		
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Art-NFTs/262051/bn_7117725294']")).click();
		driver.findElement(By.xpath("//a[@href='https://cart.payments.ebay.com/sc/view']")).click();
		driver.findElement(By.name("_nkw")).sendKeys("Books",Keys.ENTER);
		
		
		
		
	}
	

}
