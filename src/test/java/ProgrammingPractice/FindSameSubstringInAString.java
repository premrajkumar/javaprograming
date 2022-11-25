package ProgrammingPractice;

import org.testng.annotations.Test;

public class FindSameSubstringInAString 
{
	@Test
	public void main()
	{
	String[] s= {"flight","flow","fli"};
	int len = s[0].length();
	String p="";
	if(s[1].length()<len)
	{
		len=s[1].length();
	}
	else if(s[2].length()<len)
	{
		len=s[2].length();
	}
	for(int i=0;i<len;i++)
	{
		if(s[0].charAt(i)==s[1].charAt(i) && s[1].charAt(i)==s[2].charAt(i))
		{
			p=p+s[0].charAt(i);
		}
	}
	System.out.println(p);
	}
	
}
