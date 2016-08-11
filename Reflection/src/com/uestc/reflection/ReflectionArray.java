package com.uestc.reflection;

import java.lang.reflect.Array;

public class ReflectionArray
{
	public static void main(String[] args) throws Exception
	{
		Class<?>  classType = Class.forName("java.lang.String");
		
		Object array = Array.newInstance(classType,10);
		
		Array.set(array,5,"qianhaifeng");
		
		System.out.println(Array.get(array,5));
		
		
		
		
	}
}
