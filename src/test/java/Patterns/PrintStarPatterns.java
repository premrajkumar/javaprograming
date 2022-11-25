package Patterns;

import org.testng.annotations.Test;

public class PrintStarPatterns {
	@Test
	public void main()
	{
		int n=5;
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=n;j++)//columns
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
		for(int i=n;i>=1;i--)//rows
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)//columns
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
