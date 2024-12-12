package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaBrokenLink {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
		driver.manage().window().maximize();
}
	@Test public void santaMonicaLink()
	{
		List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links " +linkDetails.size());
		
		for(WebElement element:linkDetails)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
}
	private void verify(String link) {
		
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			
			if(con.getResponseCode()==404)
			{
				System.out.println("Broken Link (404- Not Found) :" +link);
				
			}
			else
			{
				System.out.println("Other response codes");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
