package com.uestc.contest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;



public class ApplicationRun
{
	public void run()//String className
	{
		//if(MyClass.class.toString().equals("class com.uestc.contest.className"))
		{
		
		Class<MyClass> c = MyClass.class;//获得MyClass的一个Class对象
		
		
		
		Method[] methods = c.getMethods();
		
		for(Method method : methods)
		{
			if(method.isAnnotationPresent(Test.class))
			{
				if(method.getReturnType() == void.class )
				{
					//System.out.println(method.getName());
					
					Class[] ccs = method.getParameterTypes();
					if(ccs.length == 0)
					{
						//System.out.println("null " + method);
						System.out.println(method.getName());
					}
					//for(Class cc : ccs)
					{
					//	System.out.println(cc);
					}
					
					
				}
					
			}
		}
		
		}
		
	}
	
	public static void main(String[] args)
	{
		ApplicationRun a = new ApplicationRun();
		
		//System.out.println(ApplicationRun.class.toString());
		//输出 class com.uestc.contest.ApplicationRun
		a.run();
	}
	
	
	
	
	
}
