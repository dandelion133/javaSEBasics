package com.uestc.qianhaifeng;

public class GenericTest2<T>
{
	private T[] fooArray;

	public T[] getFooArray()
	{
		return fooArray;
	}

	public void setFooArray(T[] fooArray)
	{
		this.fooArray = fooArray;
	}
	
	public static void main(String[] args)
	{
		GenericTest2<String> foo = new GenericTest2<String>();
		
		String[] s1 = {"qian","hai","feng"};
		
		String[] s2;
		
		foo.setFooArray(s1);
		s2 = foo.getFooArray();
		
		//System.out.println(s1);
		for(String s : s2)
		{
			System.out.println(s);
		}
		
		
	}
	
}
