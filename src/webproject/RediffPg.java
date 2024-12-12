package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffPg {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test public void reddifPage()
	{
		
		
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select dayDetails=new Select(day);
		dayDetails.selectByValue("06");
		
		WebElement day1=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select dayDetails1=new Select(day1);
		dayDetails1.selectByValue("06");
		
		WebElement day2=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select dayDetails2=new Select(day2);
		dayDetails2.selectByValue("1986");
		
		WebElement day3=driver.findElement(By.xpath("//*[contains(@name,'city')]"));
		Select dayDetails3=new Select(day3);
		dayDetails3.selectByValue("Cochin");
		
	}

}
