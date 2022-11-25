package ProgrammingPractice;

import org.testng.annotations.Test;

public class AlternateUpperLower {
	@Test
	public void main()
	{
		String s="premkumar";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
			System.out.print(Character.toUpperCase(s.charAt(i)));
			}
			else
			{
			System.out.print(Character.toLowerCase(s.charAt(i)));
			}
		}
		
	}

}
