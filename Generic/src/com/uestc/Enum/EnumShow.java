package com.uestc.Enum;

public class EnumShow
{
	public static void main(String[] args)
	{
		E e = E.mao;
		
		//System.out.println(e.compareTo(E.valueOf(args[0])));
		System.out.println(e.compareTo(E.qian));
		
		for(E c : E.values())
		{
			//System.out.println(c);
			//System.out.println(c.ordinal());
			
			System.out.printf("%d,%s,%n",c.ordinal(),c);
			
		}
		
		
		
	}
}


enum E
{
	qian,haifeng,jingqi,mao
}
