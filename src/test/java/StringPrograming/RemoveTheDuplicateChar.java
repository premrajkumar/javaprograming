package StringPrograming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveTheDuplicateChar {
	@Test
	public void main()
	{
		String s="Banglore";
		String s1 = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		//System.out.println(set);
		for(Character s5:set)
		{
			System.out.print(s5);
		}
	}
}
