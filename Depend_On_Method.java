package Basic_Maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend_On_Method
{
	@Test
	public void Createaccount()
	{
		Assert.assertEquals("pune", "deccan");           //if assert value is same then depend_on_method is not going to work
		System.out.println("acoount is Created");        //to use this we have to aseert
	}
	@Test
	public void Modify()
	{
		System.out.println("acoount is Modify");
	}
	@Test(dependsOnMethods="Createaccount")
	public void Deleted()
	{
		System.out.println("acoount is Deleted");
	}
}
