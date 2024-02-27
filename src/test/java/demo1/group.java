package demo1;

import org.testng.annotations.Test;

public class group {
	@Test(priority=1,groups= {"sanity","regression"})
	public void T1()
	{
		System.out.println("t1");
	}
	@Test(priority=5,groups= {"smoke","sanity"})
	public void T2()
	{
		System.out.println("t2");
	}
	@Test(priority=4,groups= {"sanity"})
	public void T3()
	{
		System.out.println("t3");
	}
	@Test(priority=3,groups= {"regression"})
	public void T4()
	{
		System.out.println("t4");
	}
	@Test(priority=2,groups= {"smoke"})
	public void T5()
	{
		System.out.println("t5");
	}
	@Test(priority=2,groups= {"smoke","sanity","regression"})
	public void T6()
	{
		System.out.println("t6");
	}
	
	

}
