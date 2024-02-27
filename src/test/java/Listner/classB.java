package Listner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class classB {
	@Test
	public void Bt1()
	{
	System.out.println("BT1"+Thread.currentThread().getName());	
	}
	
	@Test
	public void Bt2()
	{
	System.out.println("BT2"+Thread.currentThread().getName());	
	}
	
	@Test
	public void Bt3()
	{
	System.out.println("BT3"+Thread.currentThread().getName());	
	}

}
