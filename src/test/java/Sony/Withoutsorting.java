package Sony;

import org.testng.annotations.Test;

public class Withoutsorting {
	@Test
	public void main()
	{
		int[] arr= {7,-3,0,2,1,-9};
		int fm=0;
		int sm=0;
		int tm=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fm)
			{
				tm=sm;
				sm=fm;
				fm=arr[i];
			}
			else if(arr[i]>sm)
			{
				tm=sm;
				sm=arr[i];
			}
			else if(arr[i]>tm)
			{
				tm=arr[i];
			}
		}
		System.out.println(fm);
		System.out.println(sm);
		System.out.println(tm);
		System.out.println(fm*sm*tm);
	}
	

}
