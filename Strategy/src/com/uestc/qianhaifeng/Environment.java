package com.uestc.qianhaifeng;

public class Environment
{
	private StrategyTest strategy;//�������й�����
	 //���幹�췽��
	public Environment(StrategyTest strategy)
	{
		this.strategy = strategy;
	}
	public StrategyTest getStrategy()
	{
		return strategy;
	}
	public void setStrategy(StrategyTest strategy)///��ֹ��һ�ι���һ�������˷ѿռ�
	{
		this.strategy = strategy;
	}
	
	
	public int calculate(int x,int y)
	{
		return strategy.calc(x,y);
	}
	
	
	
	
	
	
	
	
	
	
}
