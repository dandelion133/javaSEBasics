package com.uestc.qianhaifeng;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericMap
{
	public static void main(String[] args)
	{
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("qian","mao");
		map.put("hai","jing");
		map.put("feng","qi");
		
		Set<String> set = map.keySet();
		
		for(Iterator<String> itr = set.iterator();itr.hasNext();)
		{
			String key = itr.next();
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
		System.out.println("------------------");
		Set<Map.Entry<String,String>> set1 = map.entrySet();
		
		for(Iterator<Map.Entry<String,String>> itr2 = set1.iterator();itr2.hasNext();)
		{
			Map.Entry<String,String> entry = itr2.next();
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " = " + value);
			
		}
		
		
		
		
		
		
	}
}
