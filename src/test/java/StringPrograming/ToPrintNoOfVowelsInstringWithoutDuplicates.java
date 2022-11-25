package StringPrograming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ToPrintNoOfVowelsInstringWithoutDuplicates {
	@Test
	public void main()
	{
		String str="india";
		int count=0;
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> list = new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			list.add(ch[i]);
		}
		for(Character s:list)
		{
			if(s=='a'|| s=='e' || s=='i' || s=='o' || s=='u')
			{
				count++;
				System.out.print(s+" ");
			}

		}
		System.out.println("is a vowel and it's count is "+count );
	}
	
	@Test
	public void toPrintTheVowelsWithDuplicates()
	{
		String str="india";
		int count=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
				System.out.println(ch[i]);
			}
		}
		System.out.println("vowel count is "+count);
	}
	
}
