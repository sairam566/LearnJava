package com.main.operators;

public class Operators {

	public static int add(int a,int b)
	{
		return (a+b);
	}
	
	public static int sub(int a,int b)
	{
		return (a-b);
	}
	
	public static int mul(int a,int b)
	{
		return (a*b);
	}
	
	public static double div(int a,int b)
	{
		if(a!=0 && b!=0)
		{
			return a/b;
		}
		return 0.0d;
	}
}
