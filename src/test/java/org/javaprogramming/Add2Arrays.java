package org.javaprogramming;

import org.testng.annotations.Test;

public class Add2Arrays 
{
	@Test
	public void main()
	{
		int[] a= {2,3,1,5,2};
		int[] b= {1,4,3,2,4,8};
		int size=a.length;
		if(a.length<b.length)
		{
			size=b.length;
		}
		for(int i=0; i<size; i++)
			//i=0<5t 1<5t 2<5t 3<5t 4<5t 5<5f
		{
			try {
				System.out.print(a[i]+b[i]+" ");//3 7 4 7 6 ArrayIndexOutofBond Exception
			}
			catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
