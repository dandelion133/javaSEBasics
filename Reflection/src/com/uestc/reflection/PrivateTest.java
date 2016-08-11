package com.uestc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateTest
{
	public static void main(String[] args) throws Exception
	{
		Private p = new Private();
		
		Class<?> classType = p.getClass();
		
		Method method = classType.getDeclaredMethod("sayHello",new Class[] {String.class});
		
		method.setAccessible(true);
		
		String str = (String)method.invoke(p,new Object[] {"qianhaifeng"});
		
		System.out.println(str);
		
		System.out.println("-------------------");
		
		PrivateField p2 = new PrivateField();
		
		Class<?> classType1 = p2.getClass();
		
		Field field = classType1.getDeclaredField("x");
		
		field.setAccessible(true);//压制Java对访问修饰符的检查
		
		//System.out.println(field);
		field.set(p2,44);
		
		System.out.println(p2.getX());
		
	
		
		
		
		
		
		
		
	}
}
