package com.uestc.qianhaifeng;

public class GenericTest1<T1,T2>
{
	private T1 foo1;
	private T2 foo2;
	public T1 getFoo1()
	{
		return foo1;
	}
	public void setFoo1(T1 foo1)
	{
		this.foo1 = foo1;
	}
	public T2 getFoo2()
	{
		return foo2;
	}
	public void setFoo2(T2 foo2)
	{
		this.foo2 = foo2;
	}
	
	public static void main(String[] args)
	{
		GenericTest1<Integer,Boolean> foo = new GenericTest1<Integer,Boolean>();
		
		foo.setFoo1(new Integer(1));
		
		foo.setFoo2(new Boolean(true));
		
		
		System.out.println(foo.getFoo1());
		System.out.println(foo.getFoo2());
		
	}
	
	
	
}