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
		///Object���equals()������˵�������жϵ���equals()�����������봫�����������Ƿ�һ�£�
		//�������������Ƿ�ָ�����ͬһ������
		//����String���equals()������˵�������жϵ�ǰ�ַ����봫�������ַ����������Ƿ�һ�¡�
		//��д��Obkect���е�equals����
		//��������������˵�����ʹ��equals�����ȽϷ���true����ô�����������hashCodeֵһ������ͬ�ġ�
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