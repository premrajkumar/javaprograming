package org.Flipkart;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class SubString {
	@Test
	public void main() {
		String s="abbababaabb";
		String s1 = s.substring(7, 9);
		System.out.println(s1);
		String s2 = s.substring(1, 3);
		System.out.println(s2);
		System.out.println(s1+s2+s1+s2+s1+s2+s1);	
	}
	
	@Test
	public void main1()
	{
		String s1="1221212121";
		String a = s1.substring(0, 1);
		String b = s1.substring(2, 3);
		System.out.println(a+a+b+b+a+a+b+b+a+a+b+b);
	}
	
	@Test
	public void main2()
	{
		String s1="1221212121";
		String a = s1.substring(0, 1);
		String b = s1.substring(2, 3);
		ArrayList arr = new ArrayList<>();
		//System.out.println(a+a+b+b+a+a+b+b+a+a+b+b);
		for(int i=0;i<10;i++)
		{
			char s4 = s1.charAt(i);
			for(int k=0;k<2;k++)
			{
				if(a.equals(s1.charAt(i)-48))
				{
					arr.add(a);
				}
			}
			for(int j=0;j<2;j++)
			{
				if(b.equals(s1.charAt(i)-48))
				{
					arr.add(b);
				}
			}
		}
		System.out.println(arr);
		
		
	}
	
}
