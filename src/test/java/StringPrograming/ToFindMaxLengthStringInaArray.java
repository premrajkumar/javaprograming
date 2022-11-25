package StringPrograming;

import org.testng.annotations.Test;

public class ToFindMaxLengthStringInaArray {
	@Test
	public void main()
	{
		String[] s={"abcfg","acdef","cde","se","ab","wqas"};
		String maxlength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>maxlength.length())
			{
				maxlength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==maxlength.length())
			{
				System.out.println(s[i]);
			}
		}	
	}

}
