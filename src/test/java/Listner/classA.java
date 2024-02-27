package Listner;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Listeners(MyListner.class)
public class classA {
	
	@Test(timeOut=100)
	public void At1() throws InterruptedException
	{
		Thread.sleep(200);
	System.out.println("AT1 "+Thread.currentThread().getName());
	
	// failedWithTimeOut error
	}
	
	@Test
	public void At2()
	{
	System.out.println("AT2  "+Thread.currentThread().getName());	
	AssertJUnit.assertEquals(Thread.currentThread().getName(), null);
	// Failure
	}
	
	@Test
	public void At3()
	{
	System.out.println("AT3  "+Thread.currentThread().getName());	
	
	//Success
	}
	@Test(dependsOnMethods={"At2"})
	public void At4()
	{
	System.out.println("AT4  "+Thread.currentThread().getName());	
	
	//Skipped
	}

}
