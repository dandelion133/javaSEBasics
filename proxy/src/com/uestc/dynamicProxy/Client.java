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

		// ����Ĵ���һ�������ɴ���

		Subject subject = (Subject) Proxy.newProxyInstance(classType
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				handler);//����һ��ָ���ӿڵĴ�����ʵ�����ýӿڿ��Խ���������ָ�ɵ�ָ���ĵ��ô������  h - ָ�ɷ������õĵ��ô������ 
		
		subject.request();//subject Ϊһ����ڵĴ���ʵ��
		
		System.out.println(subject.getClass());

	}
	
	
	
	
	
	
	
	
}