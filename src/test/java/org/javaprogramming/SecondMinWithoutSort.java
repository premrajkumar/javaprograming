package org.javaprogramming;

import org.testng.annotations.Test;

public class SecondMinWithoutSort {
	@Test
	public void main()
	{
		int[] arr={3,3,10,11,8,4,7,6,1};
		int fmin=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=fmin)
			{
				if(arr[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=arr[i];
			}
			else if(fmin==smin || arr[i]<smin)
			{
				smin=arr[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}
	
}
