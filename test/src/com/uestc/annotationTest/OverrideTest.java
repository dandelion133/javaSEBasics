package com.uestc.annotationTest;

public class OverrideTest
{
	@Override
	public String toString()
	{
		 return ("this is a annotation");
	}
	public void out()
	{
		System.out.println("out something");
	}
	public static void main(String[] args)
	{
		OverrideTest test = new OverrideTest();
		
		test.out();
		System.out.println(test);
	}
}
