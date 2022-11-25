package ProgrammingPractice;

import org.testng.annotations.Test;

public class AlternateUpperAndLowerAString {
	@Test
	public void main()
	{
		String s="my name is premkumar";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(i==0 || i==2)
			{
				System.out.print(str[i].toUpperCase()+" ");  
			}
			else
			{
				System.out.print(str[i].toLowerCase()+" ");
			}
		}
	}

}
