package com.uestc.qianhaifeng;

import java.util.Iterator;
import java.util.TreeSet;
////������Ԫ�ص���Ȼ˳��������� ��ʵ��������ĸ��������
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
