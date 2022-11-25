package ProgrammingPractice;

import org.testng.annotations.Test;

public class NearestPalindrome {
	@Test
	public void main()
	{
		int a=142;
		for(int i=1;i<=a;i++)
		{
			int no=i;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
		int rem=no%10;
		sum=sum*10+rem;
		no=no/10;
	}
	
		if(sum==copy)
		{
			System.out.print(i+" ");
			System.out.print(sum+" "+"its palindrome");
			System.out.println();
		}
		
	}
}
}

