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
				System.out.println("��������ֳ�����Χ���޷�ת��");
				System.exit(0);
			}
			sc.close(); 
				
		}
		catch(Exception e)
		{
			System.out.println("������ַ�����Ϊ���֣��޷�ת��");
			System.exit(0);
		}
		finally
		{
			//sc.close(); 
		}
		/**/
		int num0 = i  % 10;//��λ
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
		
		char[] cnNumber = {'��', 'һ', '��', '��', '��', '��', '��', '��', '��', '��'};
		
		if(num7 != 0 && num6 != 0 )//11xx
		{
			System.out.print(cnNumber[num7]);
			System.out.print("ǧ");
			System.out.print(cnNumber[num6]);
			System.out.print("��");
			if(num5 != 1)
			{
				System.out.print(cnNumber[num5]);
			}
			if(num5 != 0)
			{
			  System.out.print("ʮ");
			}
			//else
				//System.out.println("��");
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			System.out.print("��");			
		}
		else if(num7 != 0 && num6 == 0 )//10xx
		{
			System.out.print(cnNumber[num7]);
			System.out.print("ǧ");
			System.out.print("��");
			if(num5 != 1)
			{
				System.out.print(cnNumber[num5]);
			}
			if(num5 != 0)
			{
				System.out.print("ʮ");
			}
			
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			System.out.print("��");
			
		}
		
		else if(num7 == 0 && num6 != 0)//01xx
		{
			System.out.print(cnNumber[num6]);
			System.out.print("��");
			
			
			if(num5 != 1)
			{
				System.out.print(cnNumber[num5]);
			}
			if(num5 != 0)
			{
				System.out.print("ʮ");
			}
			
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			
			
			
			
			System.out.print("��");
			
		}
		else if(num7 == 0 && num6 == 0)
		{
			if(num5 != 1 && num5 != 0)
			{
				System.out.print(cnNumber[num5]);
				System.out.print("ʮ");
			}
			if(num5 == 1)
			{
				System.out.print("ʮ");
			}
			
			if(num4 != 0)
			{
				System.out.print(cnNumber[num4]);
			}
			
			
			
			if(num5 != 0 || num4 != 0)
			{
				System.out.print("��");
			}
			
			   
		}
		///////////////////////////////////////////////////////////////////////
		
		if(num3 != 0 && num2 != 0 )//11xx
		{
			System.out.print(cnNumber[num3]);
			System.out.print("ǧ");
			System.out.print(cnNumber[num2]);
			System.out.print("��");
			if(num1 != 1)
			{
				System.out.print(cnNumber[num1]);
			}
			if(num1 != 0)
			{
			  System.out.print("ʮ");
			}
			//else
				//System.out.println("��");
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
					
		}
		else if(num3 != 0 && num2 == 0 )//10xx
		{
			System.out.print(cnNumber[num3]);
			System.out.print("ǧ");
			System.out.print("��");
			if(num1 != 1)
			{
				System.out.print(cnNumber[num1]);
			}
			if(num1 != 0)
			{
				System.out.print("ʮ");
			}
			
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
			
			
		}
		
		else if(num3 == 0 && num2 != 0)//01xx
		{
			System.out.print(cnNumber[num2]);
			System.out.print("��");
			
			
			if(num1 != 1)
			{
				System.out.print(cnNumber[num1]);
			}
			if(num1 != 0)
			{
				System.out.print("ʮ");
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
				System.out.print("ʮ");
			}
			if(num1 == 1)
			{
				System.out.print("ʮ");
			}
			
			if(num0 != 0)
			{
				System.out.print(cnNumber[num0]);
			}
			
			
		
			
			   
		}
		
		
		
	}
}
