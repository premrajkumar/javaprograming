package StringPrograming;

import org.testng.annotations.Test;

public class PrintNoOfVowelsPresentInAString {
	@Test
	public void main()
	{
		String str="india";
		int count=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println("vowel count is "+count);
	}
}
