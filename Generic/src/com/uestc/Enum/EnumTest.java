package com.uestc.Enum;

public class EnumTest
{
	public static void method(Q q)
	{
		switch(q)
		{
		case Qian:
			System.out.println("Qian");
			break;
		case Haifeng:
			System.out.println("Haifeng");
			break;
		case Mao:
			System.out.println("Mao");
			break;
		case Jingqi:
			System.out.println("Jingqi");
			break;
			
		}
		
			
	}
	
	
	
	public static void main(String[] args)
	{
		//Q q = Q.Mao;
		//EnumTest enums = new EnumTest();
		
		//enums.method(Q.Mao);
		
		method(Q.Mao);
	}
	
	
	
	
	
	
	
	
}
enum Q
{

		Qian,Haifeng,Mao,Jingqi

}