package com.uestc.reflection;

import java.lang.reflect.Array;

public class ReflectionArray3D
{
	//int[] dimension = int[]{4,5,6};
	public static void main(String[] args) throws Exception
	{
		int[] dimension = new int[]{4,5,6};
		
		//Class<?> classType = Class.forName("java.lang.Integer"); 
		Object array = Array.newInstance(Integer.TYPE,dimension);
		
	  Object	obj = Array.get(array,3);
		
		obj = Array.get(obj,4);  //已经转为一维数组
		
		Array.set(obj,5,new Integer(9));
		
		int[][][] arrayCast = (int[][][])array;
		
		//System.out.println(Array.get(array,5));
		
		
		System.out.println(arrayCast[3][4][5]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
