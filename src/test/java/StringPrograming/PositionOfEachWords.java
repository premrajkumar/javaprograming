package StringPrograming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfEachWords {
	@Test
	public void position()
	{
		String s1="I love I love Banglore city";
		//String s1 = new Scanner(System.in).nextLine();
		String[] s2 = s1.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]+" is in "+(i+1)+" Position ");
		}
	}
	
	@Test
	public void positionOffirstduplicateanduniqueWords()
	{
		String s1="I love love I I Banglore city";
		//String s1 = new Scanner(System.in).nextLine();
		String[] s2 = s1.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<s2.length;i++)
		{
			set.add(s2[i]);
		}
		for(String s3:set)
		{
			for(int i=0;i<s2.length;i++)
			{
				if(s3.equals(s2[i]))
				{
					System.out.println(s3+" is in "+(i+1)+" position ");
					break;
				}
			}
		}
	}

}
