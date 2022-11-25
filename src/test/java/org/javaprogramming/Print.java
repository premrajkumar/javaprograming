package org.javaprogramming;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Print {
	@Test
	public void main1()
	{
		for(;;)
		{
		int no=new Scanner(System.in).nextInt();
		if((no%3==0) && (no%5==0))
		{
			System.out.println("Hihello");
		}
		else if((no%5==0))
		{
			System.out.println("Hi");
		}
		else if((no%3==0))
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Bye");
		}
	}
	}
}
