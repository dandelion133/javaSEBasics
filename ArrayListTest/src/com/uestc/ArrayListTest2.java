package com.uestc;

import java.util.ArrayList;

public class ArrayListTest2
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("qianhaifeng");
		arrayList.add(new Integer(8));
		
		for(int i = 0;i < arrayList.size();i ++)
		{
			System.out.println(arrayList.get(i));
		}
		
		
		System.out.println("----------------------------");
		
		
		String s = (String)arrayList.get(0);
		Integer in = (Integer)arrayList.get(1);
		
		
		
		System.out.println(s);
		//System.out.println(in);
		System.out.println(in.intValue());
		
		//test toArray
		
		arrayList.clear();
		
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(3));
		arrayList.add(new Integer(4));
		arrayList.add(new Integer(5));
		
		
		Object[] a = arrayList.toArray();
		
		for(int i = 0;i < a.length;i ++)
		{
			System.out.println(((Integer)a[i]).intValue());
		}
		
		
		
		
	}
}
