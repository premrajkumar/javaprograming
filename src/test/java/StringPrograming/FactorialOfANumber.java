package StringPrograming;


import java.util.Scanner;

import org.testng.annotations.Test;

public class FactorialOfANumber {
	@Test
	public void main()
	{
		for(;;)
		{
		//int no=4;
		int no = new Scanner(System.in).nextInt();
		int fact=1;
		for(int i=no;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	}

}
