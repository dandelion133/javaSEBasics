package com.uestc.qianhaifeng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest
{
	public static void main(String[] args)
	{
		Map map = new TreeMap();
		Random random = new Random();
		//ѭ��50��  ÿ�β���һ�������
		
		for(int i = 0;i < 50;i ++)
		{
			int number = random.nextInt(41) + 10;
			Integer in = new Integer(number);///��key
			
			if(map.get(in) == null)
			{
				map.put(in,new Integer(1));
				
				
			}
			else
			{
				Integer in1 = (Integer)map.get(in);//���key��in��ֵ
				map.put(in,new Integer( in1.intValue() + 1));
				
				
				
				
				
				
			}
			
				
			
		}
		
		Collection c = map.values();
		Integer max = (Integer)Collections.max(c);
		
		ArrayList list = new ArrayList();
		
		
		Set set = map.entrySet();
		for(Iterator itr = set.iterator();itr.hasNext();)
		{
			Map.Entry entry = (Map.Entry)itr.next();
			Integer key = (Integer)entry.getKey();
			Integer value = (Integer)entry.getValue();
			
			if(max.intValue() == value.intValue())///�ҳ�������
			{
				list.add(key);
			}
			
			
			System.out.println(key + " : " + value);
			
		}
		System.out.println("������Ϊ��" + max);
		
		System.out.println("��Щ����Ϊ��");
		for(Iterator itr = list.iterator();itr.hasNext();)
		{
			Integer in3 = (Integer)itr.next();
			System.out.println(in3);
			
			
			
		}
		
		
	}
}