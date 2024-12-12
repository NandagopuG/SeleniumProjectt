package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/HTML%20Alerts/alert.html");
		driver.manage().window().maximize();
	}
	
	@Test public void alertBox()
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		driver.findElement(By.name("firstname")).sendKeys("Yuvraj");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		
	}

}
