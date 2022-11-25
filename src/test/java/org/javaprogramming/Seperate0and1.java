package org.javaprogramming;

import org.testng.annotations.Test;

public class Seperate0and1 {
	@Test
	public void sort()
	{
		int[] abb={0,1,0,1,0,1};
		int[] temp=new int[abb.length];
		int m=0;
		int n=abb.length-1;
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]==0)
			{
				temp[m]=abb[i];
				m++;
			}
			else if(abb[i]==1)
			{
				temp[n]=abb[i];
				n--;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
		System.out.print(temp[i]+" ");
		}
	}
}
