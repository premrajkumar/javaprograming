package org.javaprogramming;

import org.testng.annotations.Test;

public class FirstMaxMinValue {
 @Test
 public void sort()
	{
	int[] arr= {8,3,7,4,9,6};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
		
		System.out.print(arr[arr.length-1]+" "+"Firstmax value");
		System.out.println();
		System.out.print(arr[arr.length-2]+" "+"secondmax value");
		System.out.println();
		System.out.print(arr[0]+" "+"Firstmin value");
	}
 
}
