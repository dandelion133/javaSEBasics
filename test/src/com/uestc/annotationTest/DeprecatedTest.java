package com.uestc.annotationTest;

public class DeprecatedTest
{
	@Deprecated
	public void doSomething()
	{
		System.out.println("do something");
	}
	
	
	public static void main(String[] args)
	{
		DeprecatedTest test = new DeprecatedTest();
		test.doSomething();
	}
}
