package com.uestc.contest;

import java.util.Scanner;

public class MyInput
{
	public static void main(String[] args)
	{
		Scanner sc;
		int i = 0;
		try
		{
			sc = new Scanner(System.in);
			i = sc.nextInt();
			if(i > 99999999)
			{
				System.out.println("输入的数字超出范围，无法转换");
				System.exit(0);
			}
			sc.close(); 
				
		}
		catch(Exception e)
		{
			System.out.println("输入的字符不都为数字，无法转换");
			System.exit(0);
		}
		finally
		{
			//sc.close(); 
		}
		/**/
		int num0 = i  % 10;//个位
		//System.out.println(num0);
		int num1 = i % 100 / 10;
		//System.out.println(num1);
		int num2 = i % 1000 / 100;
		//System.out.println(num2);
		int num3 = i % 10000 / 1000;
		//System.out.println(num3);
		int num4 = i % 100000 / 10000;
		//System.out.println(num4);
		int num5 = i % 1000000 / 100000;
		//System.out.println(num5);
		int num6 = i % 10000000 / 1000000;
		//System.out.println(num6);
		int num7 = i % 100000000 / 10000000;
		//System.out.println(num7);
		
		char[] cnNumber = {'零', '一', '二', '三', '四', '五', '六', '七', '八', '九'};
		
		if(num7 != 0 && num6 != 0 )//11xx
		{
			System.out.print(cnNumber[num7]);
			System.out.print("千");
			System.out.print(cnNumber[num6]);
			System.out.print("百");
			if(num5 != 1)
			{
				System.out.print(cnNumber[num5]);
			}
			if(num5 != 0)
			{
			  System.out.print("十");
			}
			//else
				//System.out.println("零");
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			System.out.print("万");			
		}
		else if(num7 != 0 && num6 == 0 )//10xx
		{
			System.out.print(cnNumber[num7]);
			System.out.print("千");
			System.out.print("零");
			if(num5 != 1)
			{
				System.out.print(cnNumber[num5]);
			}
			if(num5 != 0)
			{
				System.out.print("十");
			}
			
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			System.out.print("万");
			
		}
		
		else if(num7 == 0 && num6 != 0)//01xx
		{
			System.out.print(cnNumber[num6]);
			System.out.print("百");
			
			
			if(num5 != 1)
			{
				System.out.print(cnNumber[num5]);
			}
			if(num5 != 0)
			{
				System.out.print("十");
			}
			
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			
			
			
			
			System.out.print("万");
			
		}
		else if(num7 == 0 && num6 == 0)
		{
			if(num5 != 1 && num5 != 0)
			{
				System.out.print(cnNumber[num5]);
				System.out.print("十");
			}
			if(num5 == 1)
			{
				System.out.print("十");
			}
			
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			
			
			if(num5 != 0 || num4 != 0)
			{
				System.out.print("万");
			}
			
			   
		}
		///////////////////////////////////////////////////////////////////////
		
		if(num3 != 0 && num2 != 0 )//11xx
		{
			System.out.print(cnNumber[num3]);
			System.out.print("千");
			System.out.print(cnNumber[num2]);
			System.out.print("百");
			if(num1 != 1)
			{
				System.out.print(cnNumber[num1]);
			}
			if(num1 != 0)
			{
			  System.out.print("十");
			}
			//else
				//System.out.println("零");
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
					
		}
		else if(num3 != 0 && num2 == 0 )//10xx
		{
			System.out.print(cnNumber[num3]);
			System.out.print("千");
			System.out.print("零");
			if(num1 != 1)
			{
				System.out.print(cnNumber[num1]);
			}
			if(num1 != 0)
			{
				System.out.print("十");
			}
			
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
			
			
		}
		
		else if(num3 == 0 && num2 != 0)//01xx
		{
			System.out.print(cnNumber[num2]);
			System.out.print("百");
			
			
			if(num1 != 1)
			{
				System.out.print(cnNumber[num1]);
			}
			if(num1 != 0)
			{
				System.out.print("十");
			}
			
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
			
			
			
			
		
			
		}
		else if(num3 == 0 && num2 == 0)
		{
			if(num1 != 1 && num1 != 0)
			{
				System.out.print(cnNumber[num1]);
				System.out.print("十");
			}
			if(num1 == 1)
			{
				System.out.print("十");
			}
			
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
			
		
			
			   
		}
		
		
		
	}
}
