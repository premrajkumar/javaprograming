package StringPrograming;

import org.testng.annotations.Test;

public class AddIntegersInAString {
	@Test
	public void addIntegersInAString1()
	{
		String s="b2c37d1";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char s1 = s.charAt(i);
			if(Character.isDigit(s1))
			{
				int f = Integer.parseInt(String.valueOf(s1));
				sum=sum+f;
			}
		}	
		System.out.println(sum);
	}
	
	@Test
	public void addIntegersInAString2()
	{
		String s="b2c37d1";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int f=s.charAt(i)-48;
				sum=sum+f;
			}
		}	
		System.out.println(sum);
	}
}
