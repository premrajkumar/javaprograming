package ProgrammingPractice;

import org.testng.annotations.Test;

public class MissingNumber {
	@Test
	public void main()
	{
		int[] a= {1,3,5,9,15};
		for(int i=0;i<a.length-1;i++)
		{
			int diff=a[i+1]-a[i];
			int count=1;
			while(diff>1)
			{
				System.out.print(a[i]+count+" ");
				count++;
				diff--;
			}
		}
	}

}
