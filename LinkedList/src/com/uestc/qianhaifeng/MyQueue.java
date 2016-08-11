package com.uestc.qianhaifeng;

import java.util.LinkedList;

//import java.util.LinkedList;



public class MyQueue
{
	
	
	private static LinkedList list = new LinkedList();
	
	public void put(Object o)
	{
		list.addLast(o);
	}
	public Object get()
	{
		return list.removeFirst();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public int size()
	{
		return list.size();
	}
	
	
	public static void main(String[] args)
	{
		MyQueue myQueue = new MyQueue();
		myQueue.put("qian");
		myQueue.put("hai");
		myQueue.put("feng");
		myQueue.put("fng");
		System.out.println(myQueue.size());
		for(int i = 0;i < 4;i ++)
		{
			System.out.println(myQueue.get()); 
		}
		
		System.out.println(myQueue.isEmpty());
			
		
		
	}
}
