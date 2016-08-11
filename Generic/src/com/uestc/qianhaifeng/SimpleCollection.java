package com.uestc.qianhaifeng;

public class SimpleCollection<T>
{
	private T[] array;
	private int index;
	
	public SimpleCollection()
	{
		//array = new T[10];
		array = (T[])new Object[10];//不能创建泛型数组
		
	}
	public SimpleCollection(int c)
	{
		//array = new T[10];
		array = (T[])new Object[c];
	}
	
	
	public void add(T t)
	{
		array[index ++] = t;
	}
	public T get(int i)
	{
		return array[i];
	}
	public static void main(String[] args)
	{
		SimpleCollection<Integer> s = new SimpleCollection<Integer>();
		
		for(int i = 0;i < 10;i ++)
		{
			s.add(new Integer(i));
		}
		
		for(int i = 0;i < 10;i ++)
		{
			System.out.println(s.get(i));
		}
		
		
	}
	
	
	
	
	
	
}
