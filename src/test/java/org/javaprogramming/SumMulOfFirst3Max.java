package org.javaprogramming;

import org.testng.annotations.Test;

public class SumMulOfFirst3Max {
	@Test
	public void max3Sum()
	{
	int[] arr= {8,3,7,4,9,6};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int sum=0;
	for(int i=0;i<=2;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("first 3 max sum is "+ sum);
}
	@Test
	public void max3Mult()
	{
	int[] arr= {8,3,7,4,9,6};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int mul=1;
	for(int i=0;i<=2;i++)
	{
		mul=mul*arr[i];
	}
	System.out.println("first 3 max mul is "+ mul);
}
}
