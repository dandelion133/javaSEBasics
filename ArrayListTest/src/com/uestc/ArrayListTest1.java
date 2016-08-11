////ArrayList 所存放的都是引用


package com.uestc;

import java.util.*;

public class ArrayListTest1
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		
		//arrayList.add("Hello");
	//arrayList.add("World");
	//	arrayList.add("welcom");
		arrayList.add("qian");
		arrayList.add("hai");
		arrayList.add("feng");
		
		String s1 = (String)arrayList.get(0);
		String s2 = (String)arrayList.get(1);
		String s3 = (String)arrayList.get(2);
	//	String s4 = (String)arrayList.get(3);
	//	String s5 = (String)arrayList.get(4);
	//	String s6 = (String)arrayList.get(5);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println("----------------------");
		
		
		for(int i = 0;i < arrayList.size();i ++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("----------------------");
		//arrayList.clear();
		
		//System.out.println(arrayList.isEmpty());
		arrayList.remove(1);
		for(int i = 0;i < arrayList.size();i ++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("----------------------");
		
		System.out.println(arrayList.indexOf("feng"));
		
		
	}
}
