package org.Flipkart;

import org.testng.annotations.Test;

public class SumOfDigitWithoutUsingAnyLoop {

	@Test
	public void main()
	{
		int no=5678;
		int sum=0;
		if(no!=0)
		{
			sum=no%10+(no/10)%10+(no/100)%10+(no/1000)%10;
		}
		System.out.println(sum);
	}
}
