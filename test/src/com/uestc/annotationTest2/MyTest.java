package com.uestc.annotationTest2;

@MyAnnotation(hello = "beijing", world = "shanghai")
public class MyTest
{
	@MyAnnotation(hello = "tianjin", world = "shangdi")
	@Deprecated
	@SuppressWarnings("unchecked") 
	public void output()
	{
		System.out.println("output something!");
	}
}