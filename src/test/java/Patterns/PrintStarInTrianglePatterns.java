package Patterns;

import org.testng.annotations.Test;

public class PrintStarInTrianglePatterns {
	@Test
	public void main()
	{
		int n=5;
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=i;j++)//columns
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
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=i;j++)//columns
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main2()
	{
		int n=5;
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=i;j++)//columns
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main4()
	{
		int n=5;
		for(int i=1,k=5;i<=n;i++,k--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main5()
	{
		int n=5;
		for(int i=1,k=0;i<=n;i++,k+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main6Mine()
	{
		int n=5;
		for(int i=1,k=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	
	@Test
	public void main7()
	{
		int n=5;
		int k=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
				System.out.print(k++%9+1+" ");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void main8()
	{
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main9()
	{
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void main10()
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}	
	}
	@Test
	public void main11()
	{
			int n=5;
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
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

