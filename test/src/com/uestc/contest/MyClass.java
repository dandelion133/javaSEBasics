package com.uestc.contest;

public class MyClass
{
	public void method1()
	{
		System.out.println("this method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("this method2");
	}
	@Test
	public void method3(int a)
	{
		if(a > 0)
			System.out.println("a > 0");
		else
			System.out.println("a <= 0");
	}
	@Test
	public int add(int x,int y)
	{
		return x + y;
	}
	@Test
	public void doSomething()
	{
		System.out.println("do something");
	}
	@Test
	public void doSomething2()
	{
		System.out.println("do something1");
	}
	
	
	
}
