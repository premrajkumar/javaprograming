package StringPrograming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ToprintUniqueValue {
	@Test
	public void main()
	{
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();//LinkedHashset is used to remove duplicate and follow order of insertion.
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
			if(ch==s.charAt(i))
			{
				count++;
			}
			}
			if(count==1)
			{
				System.out.println(ch+" is repeating "+count+" times ");
		}
		
		
	}
	}

}
