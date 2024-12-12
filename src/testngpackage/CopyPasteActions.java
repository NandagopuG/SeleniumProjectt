package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPasteActions {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void copyPaste()
	{
		Actions act=new Actions(driver);
		WebElement fullName=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fullName.sendKeys("Nandagopu");
		WebElement chooseId=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		act.keyDown(fullName, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullName, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(chooseId, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}

}
