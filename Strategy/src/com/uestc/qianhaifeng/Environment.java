package com.uestc.qianhaifeng;

public class Environment
{
	private StrategyTest strategy;//定义类中国属性
	 //定义构造方法
	public Environment(StrategyTest strategy)
	{
		this.strategy = strategy;
	}
	public StrategyTest getStrategy()
	{
		return strategy;
	}
	public void setStrategy(StrategyTest strategy)///防止再一次构造一个对象，浪费空间
	{
		this.strategy = strategy;
	}
	
	
	public int calculate(int x,int y)
	{
		return strategy.calc(x,y);
	}
	
	
	
	
	
	
	
	
	
	
}
