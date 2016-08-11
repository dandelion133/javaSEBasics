package com.uestc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RelectionTest
{
	public Object copy(Object obj) throws Exception
	{
		Class<?> classType = obj.getClass();//获得关于obj的Class对象
		
		Object objCopy = classType.getConstructor(new Class[] {}).newInstance();//使用构造方法构造一个对象  不带参数
		
		//以下获得所有属性
		
		Field[] fields = classType.getDeclaredFields();
		
		for(Field field : fields)
		{
			String fieldName = field.getName();
			
			String firstName = fieldName.substring(0,1).toUpperCase();
			
			String getMethodName = "get" + firstName + fieldName.substring(1);
			
			String setMethodName = "set" + firstName + fieldName.substring(1);
			
			Method getMethod = classType.getMethod(getMethodName,new Class[]{});
			
			Method setMethod = classType.getMethod(setMethodName,new Class[]{field.getType()});
			
			Object value = getMethod.invoke(obj,new Object[] {});
			
			setMethod.invoke(objCopy,new Object[] {value});
			
			
			
			
		}
		
		
		
		
		
		
		
		return objCopy;
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		RelectionTest test = new RelectionTest();
		
		Customer customer = new Customer(20,"qianhaifeng",1L);
		
		
		Customer customer2 = (Customer)test.copy(customer);
		
		System.out.println(customer2.getID());
		System.out.println(customer2.getAge());
		System.out.println(customer2.getName());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}


class Customer
{
	private Long ID;
	
	private String name;
	 
	private int age;
	
	
	
	public Customer()
	{}
	
	public Customer(int age,String name,Long ID)
	{
		this.age = age;
		this.ID = ID;
		this.name = name;		
	}
	
	
	
	
	
	
	
	

	public Long getID()
	{
		return ID;
	}

	public void setID(Long iD)
	{
		ID = iD;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
	
	
}
