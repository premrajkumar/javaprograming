package org.Flipkart;

import org.testng.annotations.Test;

public class AddIntegerInString {
	@Test
	public void main()
	{
		String a="1A2B3C";
		int sum=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				int f = a.charAt(i)-48;
				sum=sum+f;
			}
		}
		System.out.println(sum);
	}

}
