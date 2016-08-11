package com.uestc.Enum;


public class ColorTest
{
	public static void main(String[] args)
	{
		Color myColor = Color.mao;
		System.out.println(myColor);
		
		
		
		System.out.println("-----------------------");
		
		
		for(Color c : Color.values())
		{
			System.out.println(c);
		}
		
	}
}
