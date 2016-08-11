package com.uestc.qianhaifeng;

public class Client
{
	public static void main(String[] args)
	{
		AddStrategy add = new AddStrategy();
		Environment envirnoment = new Environment(add);
		int m = 9;
		int n = 2;
		
		int x = envirnoment.calculate(m,n);
		System.out.println(m + "��" + n +  "��ӵĽ��Ϊ��" + x);
		
		SubStrategy sub = new SubStrategy();
		envirnoment.setStrategy(sub);
		System.out.println(m + "��" + n +  "����Ľ��Ϊ��" + envirnoment.calculate(m,n));
		
		MultiplyStrategy multiply = new MultiplyStrategy();
		envirnoment.setStrategy(multiply);
		System.out.println(m + "��" + n +  "��ӵĽ��Ϊ��" + envirnoment.calculate(m,n));
		
		DevideStrategy devide = new DevideStrategy();
		envirnoment.setStrategy(devide);
		System.out.println(m + "��" + n +  "��ӵĽ��Ϊ��" + envirnoment.calculate(m,n));
		
		
		
	}
}