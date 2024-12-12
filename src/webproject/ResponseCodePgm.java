package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCodePgm {
	String link="https://www.facebook.com/";
	
	@Test public void responseCodeFb()
	{
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			System.out.println(code);
			if(code==200)
			{
				System.out.println("Successful link");
			}
			else
			{
				System.out.println("Not a successful link");
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
