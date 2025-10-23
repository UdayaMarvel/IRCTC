package com.sangee;

public class Reversenum {
	public static void main(String[] args)
	{
		
	int num= 234;
	int a,rev=0;
	while(num>0)
	{
		a=num%10;
		rev=rev*10+a;
		num=num/10;
	}
	System.out.println(rev);
		System.out.println("reverse number:");
		
		
	}
				

}
