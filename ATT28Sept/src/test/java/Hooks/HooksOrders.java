package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class HooksOrders {
	
	

	@Before("@sanity")
	public void beforeHooks1()
	
	{
		System.out.println("before hook1 is executing");
	}
	
	@After("@functional")
	public void afterHooks1()
	{
		System.out.println("after hook1 is executing");
	}
	
	@BeforeStep("@regression")
	public void beforeStep()
	{
		System.out.println("before step is executing");
	}
	@AfterStep()
	public void afterStep()
	{
		System.out.println("after step is executing");
	}
	@BeforeAll()
	public static void beforeAllHook()
	{
		System.out.println("before all is executing");
	}
	@AfterAll()
	public static void afterAllHook()
	{
	System.out.println("after all is executing");	
	}
	}

