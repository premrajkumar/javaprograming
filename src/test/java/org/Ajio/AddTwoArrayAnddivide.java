package org.Ajio;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class AddTwoArrayAnddivide {
	@Test
	public void main()
	{
		int[] a= {5,22,155,1000};
		int[] b= {5,6,7,22};
		int[] c=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(int j=0;j<c.length;j++)
		{
		System.out.println(c[j]);
		}
		ArrayList<Object> arr = new ArrayList<>();
		for(int k=0;k<c.length;k++)
		{
			if(c[k]>9)
			{
				String g = Integer.toString(c[k]);
				char[] d = g.toCharArray();
				for(int h=0;h<d.length;h++)
				{
					
					arr.add(d[h]);
				}
				
			}
			else
			{
				arr.add(c[k]);
			}
		}
//		for(int f=0;f<arr.size();f++)
//		{
//			System.out.print(arr.get(f)+" ");
//			
//		}
		System.out.println(arr);
	}

}
