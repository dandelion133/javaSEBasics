package com.uestc.qianhaifeng;

import java.util.Iterator;
import java.util.TreeSet;
////根据其元素的自然顺序进行排序。 该实例根据字母升序排序
public class TreeSetTest
{
	
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		set.add("g");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("f");
		
		//System.out.println(set);
		for(Iterator itr = set.iterator();itr.hasNext();)
		{
			String s = (String)itr.next();
			System.out.println(s);
		}
		
		
		
	}
}
