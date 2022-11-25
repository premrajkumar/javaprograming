package StringPrograming;

import org.testng.annotations.Test;

public class PrintPrimeNumberInArray {
	@Test
	public void main()
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=1;i<a.length;i++)
		{
			int no = a[i];
			boolean flag = true;
			for(int j=2;j<no;j++)
			{
				if((no%j)==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(no+" is prime");
			}
			else
			{
				System.out.println(no+" is not prime");
			}
		}
	}
	@Test
	public void main1()
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int j=2;
			while(j<=n)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(j==n)
			{
				System.out.println(n);
			}
		}
	}

}
