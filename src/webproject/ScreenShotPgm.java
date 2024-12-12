package webproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPgm {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/HTML%20Alerts/alert.html");
		driver.manage().window().maximize();
	}
	
	@Test public void screenShot() throws IOException 
	{
		File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(c, new File("C:\\Users\\HP\\Downloads\\LuminarSS\\imagesScreen.png"));
		
		WebElement button=driver.findElement(By.xpath("//input[@value='Display alert box']"));
		File buttonImage=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonImage, new File("./screenshot/buttonimage.png"));
		
		
		
	}

}
