package StringPrograming;

import org.testng.annotations.Test;

public class FindMaxLengthIntegerInaArray {
	@Test
	public void main()
	{
		int[] s= {12547,5487,475,415256,45};
		String max = Integer.toString(s[0]);
		for(int i=0;i<s.length;i++)
		{
			if(Integer.toString(s[i]).length()>max.length())
			{
				max=Integer.toString(s[i]);
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(Integer.toString(s[i]).length()==max.length())
			{
				System.out.println(Integer.toString(s[i]));
			}
		}
	}

}
