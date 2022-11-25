package StringPrograming;

import org.testng.annotations.Test;

public class FibbonacciSeries {
	@Test
	public void main()
	{
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=0;i<=10;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
	}
}
