package com.uestc.Enum;

public enum EnumConstruct////枚举类型的构造方法
{
	qian("mao"),haifeng("jingqi");
	
	
	private String value;
	
	
	public String getValue()
	{
		return value;
	}
	
	EnumConstruct(String value)
	{
		this.value = value;
	}
	
	
	public static void main(String[] args)
	{
		EnumConstruct e = EnumConstruct.qian;
		
		
		System.out.println(e.getValue());
		
		
		e = EnumConstruct.haifeng;
		
		System.out.println(e.getValue());
		
		
		
	}
	
}
