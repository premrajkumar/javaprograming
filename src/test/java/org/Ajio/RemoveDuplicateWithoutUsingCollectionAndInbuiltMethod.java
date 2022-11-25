package org.Ajio;

import org.testng.annotations.Test;

public class RemoveDuplicateWithoutUsingCollectionAndInbuiltMethod {
	@Test
	public void main()
	{
		String s="premkumar";
		String rem="";
		for(int i=0;i<s.length();i++)
		{
			if(rem.contains(s.charAt(i)+""))
			{
				
			}
			else
			{
				rem=rem+s.charAt(i);
			}
		}
		
		System.out.println(rem);
		
	}

}
