package com.uestc.reflection;

public class SuperClass
{
	public static void main(String[] args)
	{
		Class<?> classType = Child.class;
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();//���ر�ʾ�� Class ����ʾ��ʵ��
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
	}
}


class Parent
{
	
}

class Child extends Parent
{
	
}
