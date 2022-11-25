package StringPrograming;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPalindrome {
	
	@Test
	public void palind()
	{
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
	@Test
	public void palindrome()
	{
		String s = new Scanner(System.in).next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	

}
