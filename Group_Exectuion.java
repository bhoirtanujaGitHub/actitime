package Basic_Maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group_Exectuion 
{
	@Test(groups="task")
	public void Createaccount()
	{ 
		System.out.println("acoount is Created");        
	}
	@Test(groups="report")
	public void Modify()
	{
		System.out.println("acoount is Modify");
	}
	
	@Test(groups="task")
	public void Deleted()
	{
		System.out.println("acoount is Deleted");
	}
}
