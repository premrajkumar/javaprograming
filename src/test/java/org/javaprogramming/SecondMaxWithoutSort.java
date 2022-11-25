package org.javaprogramming;

import org.testng.annotations.Test;

public class SecondMaxWithoutSort {
	@Test
	public void main()
	{
		int[] arr={3,10,11,8,4,7,6};
		int fmax=arr[0];
		int smax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=fmax)
			{
				if(arr[i]!=fmax)
				{
					smax=fmax;
				}
				fmax=arr[i];
			}
			else if(fmax==smax || arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}
