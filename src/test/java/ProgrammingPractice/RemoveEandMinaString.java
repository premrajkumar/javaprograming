package ProgrammingPractice;

import org.testng.annotations.Test;

public class RemoveEandMinaString {
	@Test
	public void main()
	{
		String s="premkumar";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='e' && s.charAt(i)!='m')
			{
	System.out.print(s.charAt(i));	
			}
		}
	}

}
