package com.uestc.qianhaifeng;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("a","qian");
		map.put("b","hai");
		map.put("c","feng");
		map.put("d","mao");
		map.put("e","jing");
		map.put("f","qi");
		
		String s = (String)map.get("f");
		System.out.println(s);
		
		System.out.println("---------------------------------");
		System.out.println(map.get("x"));
		System.out.println("---------------------------------");
		
		String s1 = new String("MaoJingQi");
		map.put("g",s1);
		///map.put("g",s1);
		System.out.println(map);
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		Set set = map.keySet();//返回一个key的集合  通过key的集合输出key所映射的值
		for(Iterator itr = set.iterator();itr.hasNext();)
		{
			String key = (String)itr.next();
			System.out.println(map.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
