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
		//��ͳ�Ļ�ȡ����
		
		InvokerTester test1 = new InvokerTester();
		
		System.out.println(test1.add(1,2));
		
		System.out.println(test1.ehco("qianhaifeng"));
		
		System.out.println("--------------------------------------");
		
		Class<?> classType = InvokerTester.class;//���InvokerTester������Ӧ��Class����
		
		Object test = classType.newInstance();//����InvokerTester��һ����
		
		Method methods = classType.getMethod("add",new Class[]{int.class,int.class});
		//���InvokerTester��add����
		
		Object result = methods.invoke(test,new Object[]{1,2});//ʹ�û�õ�add����
		//�Դ���ָ��������ָ����������ɴ� Method �����ʾ�ĵײ㷽��
		System.out.println((Integer)result);
		
		
		Method method = classType.getMethod("ehco",new Class[]{String.class});
		
		Object result2 = method.invoke(test,new Object[]{"qianhaifeng"});
		
		System.out.println((String)result2);
		
	}
}
