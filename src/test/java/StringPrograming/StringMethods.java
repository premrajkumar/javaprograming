package StringPrograming;

import org.testng.annotations.Test;

public class StringMethods {
	@Test
	public void main()
	{
	String s="welcome";
		System.out.println(s.length());
		
		String st="welcome";
		st.toCharArray();	
		System.out.println(st.length());
		
		String sf="welcome";
		System.out.println(sf.charAt(1));
		
		String sr="welcome";
		System.out.println(sr.indexOf('o'));
		
		String s1="hi";
		String s2="hello";
		String s3="welcome";//hihellowelcome
		System.out.println(s1.concat(s2).concat(s3));
		
		String s4="h1";
		String s5="hello";
		String s6="welcome";
		String joined= String.join(" ",s4,s5,s6);
		System.out.println(joined);
		
		String s7="welcome";
		System.out.println(s7.contains("lc"));
		
		String s8="welcome";
		System.out.println(s8.startsWith("we"));
		
		String s9="welcome";
		System.out.println(s9.endsWith("me"));
		
		String s10="welcome";
		String s11=" ";
		System.out.println(s11.isBlank());
		
		String s12="welcome";
		String s13=" ";
		System.out.println(s12.isEmpty());
		
		String s14="hi hello welcome";
		System.out.println(s14.trim());
		
		String s15="welcome";
		System.out.println(s15.substring(0,4));
		
		String s16="hi hello welcome";
		String[] ss=s16.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]);
		}
		
		String s17="hi";
		String s18="hi";
		System.out.println(s17.equals(s18));
		
		String s19="hi hello namaste";
		System.out.println(s19.replace(" ", ""));
		
		String s20="WELCOME";
		System.out.println(s20.toLowerCase());
		
		String s21="welcome";
		System.out.println(s21.toUpperCase());
		}
	
	@Test
	public void toprintalphabets()
	{
		char ch;
		for(ch='a';ch<='z';ch++)
		{
			System.out.print(ch+" ");
		}
	}

}
