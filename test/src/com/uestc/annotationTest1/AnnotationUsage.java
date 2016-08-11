package com.uestc.annotationTest1;

public class AnnotationUsage
{
	@MyAnnotation(value1 = "qian",value2 = EnumTest.QIAN)
	
	public void hello()
	{
		System.out.println("hello world");
	}
	public static void main(String[] args)
	{
		AnnotationUsage test = new AnnotationUsage();
		
		test.hello();
		
		
	}
}
