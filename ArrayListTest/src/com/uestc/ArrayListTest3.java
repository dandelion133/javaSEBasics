package com.uestc;

import java.util.ArrayList;

public class ArrayListTest3
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Point(2,3));
		arrayList.add(new Point(4,6));
		arrayList.add(new Point(9,3));
		
		for(int i = 0;i < arrayList.size();i ++)
		{
			System.out.println(arrayList.get(i));
			///ֱ����������൱��������ָ������toString��������
		}
		
		
	}
}
