package com.uestc.qianhaifeng;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrder
{
	public static void main(String[] args)
	{
		Person p1 = new Person(20);
		Person p2 = new Person(30);
		Person p3 = new Person(40);
		Person p4 = new Person(50);
		
		TreeSet set = new TreeSet(new PersonComparator());
		//从构造方法来确定升序还是降序
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		for(Iterator itr = set.iterator();itr.hasNext();)
		{
			Person s = (Person)itr.next();
			System.out.println(s.age);
		}
		
		
		
		
	}
}
class Person
{
	int age;
	
	public Person(int age)
	{
		this.age = age;
	}
	
	
	
	
}
//class PersonComparator implements Comparator
class PersonComparator implements Comparator//重写接口Comparator类中的compare方法
{
	public int compare(Object arg0,Object arg1)
	{
		Person p1 = (Person)arg0;
		Person p2 = (Person)arg1;
		
		return p2.age - p1.age;
		
		
		
	}
}

















