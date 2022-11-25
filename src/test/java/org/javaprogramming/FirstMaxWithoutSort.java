package org.javaprogramming;

import org.testng.annotations.Test;

public class FirstMaxWithoutSort {
@Test
public void main()
{
	int[] arr={3,10,8,4,7,6};
	int fmax=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>fmax)
		{
			fmax=arr[i];
		}
	}
	System.out.println(fmax);
}

}
