package org.Ajio;

import org.testng.annotations.Test;

public class AddTwoArrayAndSeperate {
	@Test
	public void main()
	{
		int[] a= {1,2,3,100};
		int[] b= {2,32,1,22};
		int[] c=new int[7];
		int v=0;
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(j<4)
			{
				int sum=a[j]+b[j];
				//System.out.print(sum);
				if(sum<10)
				{
					c[v]=sum;
					j++;
					v++;
				}
				else {
					int d=sum%10;
					int e=sum/10;
					if(e>9 && e<100)
					{
						int f = e%10;
						int k=e/10;
						c[v]=k;
						v++;
						c[v]=f;
						v++;
						c[v]=d;
						v++;
						j++;
						
					}
					else
					{
						c[v]=e;
						v++;
						c[v]=d;
						j++;
						v++;
					}
					
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
	
	@Test
	public void main1()
	{
		int[] a= {1,2,3,34};
		int[] b= {2,32,1,3};
		int[] c=new int[6];
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(j<4)
			{
				int sum=a[j]+b[j];
				System.out.print(sum);
				if(sum<10)
				{
					c[i]=sum;
					j++;
				}
				else {
					int d=sum%10;
					int e=sum/10;
					c[i]=e;
					c[i+1]=d;
					i++;
					j++;	
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
	@Test
	public void main3()
	{
		int[] a= {1,2,100,1000};
		int[] b= {2,32,1,32};
		int[] c=new int[10];
		int v=0;
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(j<4)
			{
				int sum=a[j]+b[j];
				//System.out.print(sum);
				if(sum<10)
				{
					c[v]=sum;
					j++;
					v++;
				}
				else {
					int d=sum%10;
					int e=sum/10;
					if(e>9 && e<100)
					{
						int f = e%10;
						int k=e/10;
						c[v]=k;
						v++;
						c[v]=f;
						v++;
						c[v]=d;
						v++;
						j++;
						
					}
					else if(e>100 && e<1000)
					{
					int u=e%10;
					int s=e/10;
					if(s>9 && s<100)
					{
						int f = s%10;
						int k=s/10;
						c[v]=k;
						v++;
						c[v]=f;
						v++;
						c[v]=u;
						v++;
						c[v]=d;
						v++;
						j++;
					}
					
					}
					else
					{
						c[v]=e;
						v++;
						c[v]=d;
						j++;
						v++;
					}
					
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
