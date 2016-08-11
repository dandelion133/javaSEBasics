package com.uestc.reflection;

import java.lang.reflect.Method;

public class InvokerTester
{
	public int add(int a,int b)
	{
		return a + b;
	}
	public String ehco(String name)
	{
		return "hello:" + name;
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		//传统的获取方法
		
		InvokerTester test1 = new InvokerTester();
		
		System.out.println(test1.add(1,2));
		
		System.out.println(test1.ehco("qianhaifeng"));
		
		System.out.println("--------------------------------------");
		
		Class<?> classType = InvokerTester.class;//获得InvokerTester类所对应的Class对象
		
		Object test = classType.newInstance();//生成InvokerTester的一个类
		
		Method methods = classType.getMethod("add",new Class[]{int.class,int.class});
		//获得InvokerTester的add方法
		
		Object result = methods.invoke(test,new Object[]{1,2});//使用获得的add方法
		//对带有指定参数的指定对象调用由此 Method 对象表示的底层方法
		System.out.println((Integer)result);
		
		
		Method method = classType.getMethod("ehco",new Class[]{String.class});
		
		Object result2 = method.invoke(test,new Object[]{"qianhaifeng"});
		
		System.out.println((String)result2);
		
	}
}
