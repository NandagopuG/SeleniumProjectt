package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseAmazon {
	ChromeDriver driver;
	@Before public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	
	@Test public void responseAmazon()
	{
		List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links= " +linkDetails.size());
		
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
			//int code=con.getResponseCode();
			if(con.getResponseCode()==200)
			{
				System.out.println("Response Code is 200 " +link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Response code is 404 " +link);
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
