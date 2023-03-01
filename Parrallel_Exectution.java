package Basic_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parrallel_Exectution 
{
	@Test
	public void para()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	}
	
	@Test
	public void facebook()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Test                                    
	public void selenium()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}                    


	}
