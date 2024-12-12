package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	ChromeDriver driver;
	@BeforeTest 
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	@Test
	public void dragDrop()
	{
		Actions act=new Actions(driver);
		WebElement AmntSrc=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement AmntDst=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement BankSrc=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement BankDst=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(AmntSrc, AmntDst);
		act.dragAndDrop(BankSrc, BankDst);
		act.perform();
		
	}
	

}
