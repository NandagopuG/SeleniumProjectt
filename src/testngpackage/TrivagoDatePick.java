package testngpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoDatePick {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void datePicker()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]")).sendKeys("Munnar",Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]")).click();
	datePickMethod("January 2025","25");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div[2]/div[4]/div/button/span/span")).click();	
	}
	public void datePickMethod(String expmonth, String expday) {
		while(true)
		{
			String month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/h3")).getText();
			System.out.println("Month "+month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
			
		}
		List<WebElement> date=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button[27]/time"));
		for(WebElement d:date)
		{
			String datetext=d.getText();
			if(datetext.equals(expday))
			{
				d.click();
				break;
			}
		
		}	
		
	}

}
