package StringPrograming;


import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveTheduplicateCharInAString {
	@Test
	public void remdup()
	{
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.print(ch);
		}
	}

}
