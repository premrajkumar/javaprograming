package StringPrograming;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class RemoveTheDuplicateWords {
	@Test
	public void main()
	{
		//String s1="I love love I Banglore city";
		String s1 = new Scanner(System.in).nextLine();
		String[] s2 = s1.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<s2.length;i++)
		{
			set.add(s2[i]);
		}
		for(String s3:set)
		{
			System.out.print(s3+" ");
		}
		
	}

}
