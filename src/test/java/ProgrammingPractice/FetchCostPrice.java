package ProgrammingPractice;

import org.testng.annotations.Test;

public class FetchCostPrice {
	@Test
	public void main()
	{
		String str = "I brought bike at Rs 10.50";
		String[] s = str.split(" ");
		String price="";
		int len = s.length;
		for(int i=0;i<len;i++)
		{
			String value = s[i];
			if(value.charAt(0)>='0' && value.charAt(0)<='9')
			{
				price=price+value;
				break;
			}
		}
		
		//double db = Double.parseDouble(price);
		System.out.println(price);
		
	}

}
