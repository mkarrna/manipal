package demo1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test(priority=6)
	public void T1()
	{
		Assert.assertEquals(0, 1);
		System.out.println("t1");
	}
	@Test(priority=2,dependsOnMethods = "T1")
	public void T2()
	{
		System.out.println("t2");
	}@Test(priority=3)
	public void T3()
	{
		System.out.println("t3");
	}@Test(priority=4)
	public void T4()
	{
		System.out.println("t4");
	}@Test(priority=5)
	public void T5()
	{
		System.out.println("t5");
	}
	
	

}
