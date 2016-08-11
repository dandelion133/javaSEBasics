package com.uestc.exceptionTest;

public class ExceptionTest
{
	public void method() throws MyException
	{
		System.out.println("qian hai feng");
		
		throw new MyException("这是异常情况");
	}
	
	
	public static void main(String[] args) throws MyException
	{
		ExceptionTest test = new ExceptionTest();
		try
		{
			
			test.method();
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("mao jing qi");
		}
	}
	
}