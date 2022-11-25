package StringPrograming;

import java.util.LinkedHashSet;
import org.testng.annotations.Test;

public class OccuranceEachWord {
	@Test
	public void main()
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
					int count=0;
					for(int i=0;i<s2.length;i++)
					{
						if(s3.equals(s2[i]))
						{
							count++;
						}
					}
					System.out.println(s3+" is repeating "+count+" times ");
				}
	}
	

}
