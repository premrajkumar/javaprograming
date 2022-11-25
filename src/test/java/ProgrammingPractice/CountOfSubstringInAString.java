package ProgrammingPractice;

import org.testng.annotations.Test;

public class CountOfSubstringInAString {
	@Test
	public void main()
	{
		String s1 = "javajavaseleniumjavajava";
		String s2="java";
		int count=0;
		int len=s1.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len+1;j++)
			{
				if(s1.substring(i,j).equals(s2))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
