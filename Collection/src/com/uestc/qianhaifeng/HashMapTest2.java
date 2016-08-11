package com.uestc.qianhaifeng;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		for(int i = 0;i < args.length;i ++)
		{
			if(map.get(args[i]) == null)
			{
				map.put(args[i],new Integer(1));
			}
			else
			{
				Integer in = (Integer)map.get(args[i]);
				Integer in2 = new Integer(in.intValue() + 1);
				map.put(args[i],in2);
			}
		}
		
		//Set set = map.keySet();
		//for(Iterator itr = set.iterator();itr.hasNext();)
		//{
		//	String key = (String)itr.next();
		//	System.out.println(key + " = " +map.get(key));
	//	}
		
		Set set = map.entrySet();
		for(Iterator itr = set.iterator();itr.hasNext();)
		{
			Map.Entry entry = (Map.Entry)itr.next();
			String key = (String)entry.getKey();
			Integer value = (Integer)entry.getValue();
			
			System.out.println(key + " : " + value);
			
		}
		
		
	}
}
