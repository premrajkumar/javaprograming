package StringPrograming;

import org.testng.annotations.Test;

public class ToSeperateNumbersAndAlphabets {
	@Test
	public void main()
	{
		String s="Aa$#1sv%2";
		String alpha="";
		String num="";
		String spec="";
		for(int i=0;i<s.length();i++)
		{
			char s2 = s.charAt(i);
			if(Character.isAlphabetic(s2))
			{ 
				alpha=alpha+s2;
			}
			else if(Character.isDigit(s2))
			{
				num=num+s2;
			}
			else
			{
				spec=spec+s2;
			}
		}
		System.out.println(alpha+" "+num+" "+spec);
	}
	@Test
	public void toseperateAlphaNumSpec()
	{
		String s1="Aa$#1sv%2";
		String alpha="";
		String num="";
		String spec="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z' || s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				alpha=alpha+s1.charAt(i);
			}
			else if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				num=num+s1.charAt(i);
			}
			else
			{
				spec=spec+s1.charAt(i);
			}
		}
		System.out.println(alpha+" "+num+" "+spec);
	}
	
	@Test
	public void main3()
	{
		String s="Aa$#1sv%2";
		String l="";
		String u="";
		String num="";
		String spec="";
		for(int i=0;i<s.length();i++)
		{
			char s2 = s.charAt(i);
			if(Character.isUpperCase(s2))
			{ 
				u=u+s2;
			}
			else if(Character.isLowerCase(s2))
			{
				l=l+s2;
			}
			else if(Character.isDigit(s2))
			{
				num=num+s2;
			}
			else
			{
				spec=spec+s2;
			}
		}
		System.out.println(u+" "+l+" "+" "+num+" "+spec);
	}
}
