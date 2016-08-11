package com.uestc.qianhaifeng;

public class WrapperFoo<T>
{
	private GenericFoo1<T> foo;

	public GenericFoo1<T> getFoo()
	{
		return foo;
	}

	public void setFoo(GenericFoo1<T> foo)
	{
		this.foo = foo;
	}
	public static void main(String[] args)
	{
		GenericFoo1<Integer> in = new GenericFoo1<Integer>();
		
		in.setT(new Integer(1));
		
		WrapperFoo<Integer> p = new WrapperFoo<Integer>();
		
		p.setFoo(in);
		
		System.out.println(p.getFoo().getT());
		
		
		
		
	}
	
}

class GenericFoo1<T>
{
	private T t;

	public T getT()
	{
		return t;
	}

	public void setT(T t)
	{
		this.t = t;
	}
	
	
}