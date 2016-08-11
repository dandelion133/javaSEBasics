package com.uestc.annotationTest1;

public @interface MyAnnotation
{
	String value1();
	EnumTest value2();
}

enum EnumTest
{
	QIAN,HAI,FENG;
}
