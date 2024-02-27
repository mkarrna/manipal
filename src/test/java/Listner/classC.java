package Listner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class classC {
	@Test
	public void Ct1()
	{
	System.out.println("CT1"+Thread.currentThread().getName());	
	}
	
	@Test
	public void Ct2()
	{
	System.out.println("CT2"+Thread.currentThread().getName());	
	}
	
	@Test
	public void Ct3()
	{
	System.out.println("CT3"+Thread.currentThread().getName());	
	}

}
