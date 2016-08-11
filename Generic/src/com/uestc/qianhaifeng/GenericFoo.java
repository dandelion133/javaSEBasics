package com.uestc.qianhaifeng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericFoo<T>
{
	private T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
	public static void main(String[] args)
	{
		GenericFoo<Integer> in= new GenericFoo<Integer>();
		
		GenericFoo<Boolean> bit= new GenericFoo<Boolean>();
		
		in.setFoo(new Integer(1));
		
		bit.setFoo(new Boolean(false));
		
		Integer in2 = in.getFoo();
		Boolean bit2 = bit.getFoo();
		
		System.out.println(in2);
		
		System.out.println(bit2);
		
		System.out.println("----------------------------------------");
		
		GenericFoo<? extends List> g = null;
		
	//	g = new GenericFoo<LinkedList>();
		
		g = new GenericFoo<ArrayList>();
		
		
	//	ArrayList list = new ArrayList();
	//	list.add("a");
	//	list.add("b");
	//	list.add("c");
		
	//	g.setFoo(list);
		
	//	ArrarList l = g.getFoo();
		GenericFoo<? super List> ge2 = null;//super表示对父类对象的引用
		
		ge2 = new GenericFoo<Object>();
		
		
		GenericFoo<String> ge3 = new GenericFoo<String>();
		ge3.setFoo("hello world");
		
		GenericFoo<?> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		
		ge4.setFoo(null);
		
		System.out.println(ge4.getFoo());
		
		
		
		
		
	}
	
	
}
