package com.uestc.qianhaifeng;

import java.util.HashSet;

public class HashSetTest2
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		
//		set.add(new People("zhangsan"));
//		set.add(new People("lisi"));
//		set.add(new People("zhangsan"));
		
//		People p1 = new People("zhangsan");
//		
//		set.add(p1);
//		set.add(p1);
		
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println("equals value: " + s1.equals(s2));
		System.out.println("hash code: " + (s1.hashCode() == s2.hashCode()));
		///Object类的equals()方法来说，它是判断调用equals()方法的引用与传进来的引用是否一致，
		//即这两个引用是否指向的是同一个对象
		//对于String类的equals()方法来说，它是判断当前字符串与传进来的字符串的内容是否一致。
		//重写了Obkect类中的equals方法
		//对于两个对象来说，如果使用equals方法比较返回true，那么这两个对象的hashCode值一定是相同的。
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
	}
}

class People
{
	String name;

	public People(String name)
	{
		this.name = name;		
	}

}
