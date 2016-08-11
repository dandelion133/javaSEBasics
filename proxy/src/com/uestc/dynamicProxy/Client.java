package com.uestc.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
	public static void main(String[] args)
	{
		RealSubject realSubject = new RealSubject();

		InvocationHandler handler = new DynamicSubject(realSubject);

		Class<?> classType = handler.getClass();

		// 下面的代码一次性生成代理

		Subject subject = (Subject) Proxy.newProxyInstance(classType
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				handler);//返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序  h - 指派方法调用的调用处理程序 
		
		subject.request();//subject 为一个借口的代理实例
		
		System.out.println(subject.getClass());

	}
	
	
	
	
	
	
	
	
}