package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class GuruDemo {
	
	ChromeDriver driver;
	@BeforeTest public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	public void guruDemo()
	{		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions act=new Actions(driver);
		act.contextClick(element);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")));
		act.perform();		
		
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();		
		
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(element1);
		act.perform();
		
		Alert a1=driver.switchTo().alert();
		String s1=a1.getText();
		System.out.println(s1);
		a1.accept();		
		
	}
}
