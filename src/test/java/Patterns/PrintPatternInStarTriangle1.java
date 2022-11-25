package Patterns;

import org.testng.annotations.Test;

public class PrintPatternInStarTriangle1 {
	@Test
	public void main()
	{
		int n=5;
		for(int i=1;i<=n;i++)//rows
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)//columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main1()
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>0;j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
