package com.uestc.qianhaifeng;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("e");
		list.add("c");
		list.add("d");
		
		
		Collections.sort(list,Collections.reverseOrder());
		//Colections类下的方法都为静态static的方法，可以通过类.方法直接调用
		
		
		for(Iterator itr = list.iterator();itr.hasNext();)
		{
			String s = (String)itr.next();
			System.out.println(s);
		}
		
		
	}
}
