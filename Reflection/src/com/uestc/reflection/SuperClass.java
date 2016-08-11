package com.uestc.reflection;

public class SuperClass
{
	public static void main(String[] args)
	{
		Class<?> classType = Child.class;
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();//返回表示此 Class 所表示的实体
		
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
