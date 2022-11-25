package org.javaprogramming;

import org.testng.annotations.Test;

public class BubblesortDescending {
	@Test
	public void sort()
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
	
	for(int i=0;i<arr.length;i++)
	{
		
		System.out.print(arr[i]+" ");
	}
	System.out.println("Descending order");
	}
	
	@Test
	public void sort1()
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
	
	for(int i=0;i<arr.length;i++)
	{
		
		System.out.print(arr[i]+" ");
	}
	System.out.println("Descending order");
	}
}
