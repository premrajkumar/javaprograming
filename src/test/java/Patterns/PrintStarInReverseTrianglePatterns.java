package Patterns;

import org.testng.annotations.Test;

public class PrintStarInReverseTrianglePatterns {
	@Test
	public void main()
	{
		int n=5;
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=i;j<=n;j++)//columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
