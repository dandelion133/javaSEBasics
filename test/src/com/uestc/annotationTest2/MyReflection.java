package com.uestc.annotationTest2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection
{
	public static void main(String[] args) throws Exception
	{
		MyTest myTest = new MyTest();//生成一个MyTest对象
		
		Class<MyTest> c = MyTest.class;//获得MyTest的一个Class对象
		
		Method method = c.getMethod("output", new Class[]{});//获得名为output的方法放在Method类中
		
		if(method.isAnnotationPresent(MyAnnotation.class))//判断method是否使用了MyAnnotation这个注解
		{
			method.invoke(myTest, new Object[]{}); //反射机制
			
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);//获得注解MyAnnotation
			
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();
			
			System.out.println(hello + ", " + world);
		}
		
		Annotation[] annotations = method.getAnnotations();
		
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation.annotationType().getName());
		}
	}
}
