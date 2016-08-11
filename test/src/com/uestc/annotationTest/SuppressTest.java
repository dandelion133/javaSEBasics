package com.uestc.annotationTest;

import java.util.Map;
import java.util.TreeMap;

public class SuppressTest
{
	@SuppressWarnings({"unchecked", "deprecation"})
	public static void main(String[] args)
	{
		Map map = new TreeMap();
		
		map.put("qian","mao");
		
		System.out.println(map.get("qian"));
		
		
		
		
		
	}
}
