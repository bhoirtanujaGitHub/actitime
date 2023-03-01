package Basic_Maven;

import org.testng.annotations.Test;

public class test_1   
{
	@Test(invocationCount=2)
	public void Createaccount()
	{
		System.out.println("acoount is Created");
	}
	@Test
	public void Modify()
	{
		System.out.println("acoount is Modify");
	}
	@Test
	public void Deleted()
	{
		System.out.println("acoount is Deleted");
	}
}
