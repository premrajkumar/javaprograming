package StringPrograming;

import org.testng.annotations.Test;

public class ReverseAString {
	@Test
	public void reverse()
	{
		String s="welcome";
		int l = s.length()-1;
		String rev="";
		for(int i=l;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		}
	
	@Test
	public void reverse2()
	{
		String s1 = "welcome";
		char[] s2 = s1.toCharArray();
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.println(s2[i]);
		}
	
		
	}
	
	@Test
	public void rev()
	{
		String s3 = "welcome";
		char[] s4 = s3.toCharArray();
		int count=0;
		for(char c:s4)
		{
			count++;
			
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(s4[i]);
		}
	}
	
	@Test
	public void main()
	{
		String s6="welcome";
		StringBuffer sb=new StringBuffer(s6);
		sb.reverse();
		System.out.println(sb);
		}
	
	@Test
	public void main2()
	{
		String s7="welcome";
		StringBuilder sb1 = new StringBuilder(s7);
		sb1.reverse();
		System.out.println(sb1);
	}
}
