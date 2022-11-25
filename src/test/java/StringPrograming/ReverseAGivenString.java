package StringPrograming;

import org.testng.annotations.Test;

public class ReverseAGivenString {
	@Test
	public void reverse()
	{
		String s="I Love Kannada";//Kannada Love I
		String[] str = s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str[i]+" ";
		}
		System.out.println(rev);	
	}
	
	@Test
	public void main()
	{
		String s1="I Love Kannada";//Kannada Love I
		String[] str = s1.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}	
	}
	
	@Test
	public void reverseAWordinAString()
	{
		String s2="I Love Kannada";//I evoL adannaK
		String[] str1 = s2.split(" ");
		String rev1="";
		for(int j=0;j<str1.length;j++)
		{
		String s=str1[j];
		for(int k=s.length()-1;k>=0;k--)
		{
			System.out.print(s.charAt(k));
		}
		System.out.print(" ");
		}
		
	}

	@Test
	public void main2()
	{
		String s3="I Love my Kannada";
	String[] s4 = s3.split(" ");
	String temp=s4[0];
	s4[0]=s4[s4.length-1];
	s4[s4.length-1]=temp;
	for(int i=0;i<s4.length;i++)
	{
		System.out.println(s4[i]+" ");
	}
	}

}
