package com.uestc.annotationTest2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection
{
	public static void main(String[] args) throws Exception
	{
		MyTest myTest = new MyTest();//����һ��MyTest����
		
		Class<MyTest> c = MyTest.class;//���MyTest��һ��Class����
		
		Method method = c.getMethod("output", new Class[]{});//�����Ϊoutput�ķ�������Method����
		
		if(method.isAnnotationPresent(MyAnnotation.class))//�ж�method�Ƿ�ʹ����MyAnnotation���ע��
		{
			method.invoke(myTest, new Object[]{}); //�������
			
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);//���ע��MyAnnotation
			
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
