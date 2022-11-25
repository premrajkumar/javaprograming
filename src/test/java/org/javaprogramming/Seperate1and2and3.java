package org.javaprogramming;

import org.testng.annotations.Test;

public class Seperate1and2and3 {
	@Test
	public void main1()
	{
		int[] abb={3,1,2,3,1,1,3,1,2};
		int[] temp=new int[abb.length];
		int m=0;
		int o=(abb.length/2);
		int n=abb.length-1;
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]==3)
			{
				temp[n]=abb[i];
				n--;
			}
			else if(abb[i]==1)
			{
				temp[m]=abb[i];
				m++;
			}
			else if(abb[i]==2)
			{
				temp[o]=abb[i];
				o++;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
		System.out.print(temp[i]+" ");
		}
		System.out.println("==>1,2,3");
	}
	@Test(enabled = false)
	public void main2()
	{
		int[] abb={0,1,0,1,1,1,2,2,2,3,3,3};
		int[] temp=new int[abb.length];
		int m=0;
		int o=(abb.length/3)-2;
		int j=(abb.length/3)-2;
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
				temp[o]=abb[i];
				o++;
			}
			else if(abb[i]==2)
			{
				temp[j]=abb[i];
				j++;
			}
			else if(abb[i]==3)
			{
				temp[n]=abb[i];
				n--;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
		System.out.print(temp[i]+" "+"0,1,2");
		}
	}
	
}
