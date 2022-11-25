package org.Flipkart;

public class SumOfDigitWithoutUsingAnyLoop1 {
	static int sum;
	public static void main(String[] args) {
		int no=5678;
		int add = hi(no);
		System.out.println(add);
		
	}
	public static int hi(int num)
	{
		if(num==0)
		{
			return 0;
		}
		int last = num%10;
		sum=sum+last;
		hi(num/10);
		return sum;
	}

}
