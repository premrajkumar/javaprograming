package org.javaprogramming;

import org.testng.annotations.Test;

public class FirstMinwithoutSort {
	@Test
	public void main()
	{
		int[] arr={3,10,8,4,7,6};
		int fmin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<fmin)
			{
				fmin=arr[i];
			}
		}
		System.out.println(fmin);
	}

}
