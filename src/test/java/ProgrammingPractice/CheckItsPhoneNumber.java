package ProgrammingPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CheckItsPhoneNumber {
	@Test
	public void main()
	{
		System.out.println("Enter the Number");
		long num = new Scanner(System.in).nextLong();
	
		int count=0;
		while(num>0)
		{
			long rem = num%10;
			count++;
			num=num/10;
		}
		
		if(count==10)
		{
			System.out.println("Its a PhoneNumber");
		}
		else
		{
			System.out.println("its not a PhoneNumber");
		}
		
	}

}
