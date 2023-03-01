package Basic_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maven_1
{
	//PRIORITY
/*	@Test(priority=2)
	public void acti()
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
	public void blue()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}                    */
	
	
	//InvocationCount
	@Test
	public void acti()
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
	@Test(invocationCount=2)                                    //Here we can execute method more than one time
	public void blue()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}                    
}
