package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaPg {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
		driver.manage().window().maximize();
		
	}
	@Test public void santaMonica()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expTitle="Santa Monica";
		if(expTitle.equals(actualTitle))
		{
			System.out.println("Title are Same");
		}
		else
		{
			System.out.println("Title are different");
		}
		
		
		String src=driver.getPageSource();
		if(src.contains("Home"))
		{
			System.out.println("Content present");
		}
		else
		{
			System.out.println("Content not present");
		}
		
		driver.findElement(By.xpath("//a[@href='https://santamonicaedu.in/overseas-education-santamonica-study-abroad-pvt-ltd/']")).click();
		//driver.findElement(By.xpath("//a[@href='https://santamonicaedu.in/country/study-in-australia/']")).click();
		//driver.findElement(By.xpath("//a[@href='#']")).click();
		driver.findElement(By.xpath("//a[@href='https://santamonicaedu.in/our-branches/"
				+ "']")).click();
		
		
	}

}
