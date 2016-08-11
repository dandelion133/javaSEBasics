package com.uestc.qianhaifeng;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Frequency
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//for(int i = 0; i < args.length;i ++)
		{
			//if(map.get(args[i]) == null)
			//	map.put(args[i],1);
			//else	
			//	map.put(args[i],map.get(args[i])+ 1);
			
			
			//map.put(args[i],map.get(args[i]) == null ? 1: map.get(args[i])+ 1);
			
		}
		for(String keyvalue : args)
			map.put(keyvalue,map.get(keyvalue) == null ? 1: map.get(keyvalue)+ 1);	
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Iterator<Map.Entry<String, Integer>> itr = set.iterator();itr.hasNext();)
		{
			Map.Entry<String, Integer> entry = itr.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " : " + value);
			
		}
		System.out.println(map);
		
		
	}
}
