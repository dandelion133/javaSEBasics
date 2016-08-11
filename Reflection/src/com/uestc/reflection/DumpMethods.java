package com.uestc.reflection;

import java.lang.reflect.Method;

public class DumpMethods
{
	public static void main(String[] args) throws  Exception
	{
		Class<?> classType = Class.forName("java.lang.Object");
		
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method c : methods)
		{
			System.out.println(c);
		}
		
		
		
		
	}
}
