package StringPrograming;

import org.testng.annotations.Test;

public class FindMinLengthStringInStringArray {
	@Test
	public void main()
	{
		String[] s={"abcde","cde","se","ab","wqas"};
		String minlength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<minlength.length())
			{
				minlength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==minlength.length())
			{
				System.out.println(s[i]);
			}
		}	
	}
	
	@Test
	public void main1()
	{
		String[] s={"abcde","cde","se","ab","wqas"};
		String minlength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<minlength.length())
			{
				minlength=s[i];
			}
		}
		System.out.println(minlength);
	}

}
