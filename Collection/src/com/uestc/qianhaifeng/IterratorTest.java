package com.uestc.qianhaifeng;

import java.util.HashSet;
import java.util.Iterator;

///Set都是通过Iterator来得到集合中的具体值
public class IterratorTest
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		Integer i = new Integer(2); 
		set.add(i);
	//	set.add("1");
	//	set.add("3");
	///	set.add("r");
	//	set.add("f");
	//	set.add("d");
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Integer s = (Integer)itr.next();
			System.out.println(s.intValue());
		}
		
	}
}
