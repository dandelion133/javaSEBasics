package com.uestc.exceptionTest;

public class ExceptionTest2
{
	public void method()
	{
		try
		{
			System.out.println("try block");
			//return;
			//System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("over");
	}
	
	public static void main(String[] args)
	{
		ExceptionTest2 test = new ExceptionTest2();
		test.method();
	}
	
}
