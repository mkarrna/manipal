package Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		String str=result.getName();
		System.out.println(str+"started!!");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String str=result.getName();
		System.out.println(str+"Success!!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String str=result.getName();
		System.out.println(str+"Failure!!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String str=result.getName();
		System.out.println(str+"Skipped!!");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String str=result.getName();
		System.out.println(str+"FailedWithTimeOut!!");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("All test excecution started!!");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test excecution finished");
	}
	

}
