package org.javaprogramming;

import org.testng.annotations.Test;

public class Swap2Numbers {
	@Test
	public void main()
	{
		int a=20;
		int b=10;
		System.out.println("before swap==> A value is="+a+" & B value is ="+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swap==> A value is="+a+" & B value is ="+b);
	}
	
	@Test
	public void main1()
	{
		int a=20;
		int b=10;
		int thirdvar;
		System.out.println("before swap==> A value is="+a+" & B value is ="+b);
		 thirdvar=a;
		 a=b;
		 b=thirdvar;
		 System.out.println("After swap==> A value is="+a+" & B value is ="+b);
	}
	

}
