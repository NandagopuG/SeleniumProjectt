package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Facebook";
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title are same");
		}
			else
			{
				System.out.println("Title are not same");
		}

	}

}
