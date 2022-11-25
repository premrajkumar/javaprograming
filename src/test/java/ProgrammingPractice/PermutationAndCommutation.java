package ProgrammingPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PermutationAndCommutation {
	
	public static int fact(int num)
	{
		int fact=1,i;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	
	@Test
	public void main()
	{
	int n,r;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter value of n:");
	n=scan.nextInt();
	System.out.println("Enter value of r:");
	r=scan.nextInt();
	//NCR and NPR of a number
System.out.println("NCR="+(fact(n)/(fact(n-r)*fact(r))));

System.out.println("nNPR="+(fact(n)/(fact(n-r))));
		
	}

}
