package org.javaprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ToRemoveDupli {
	@Test
	public void main2()
	{
		int[] a= {2,4,1,1,5,4};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i], 1);
			}
			else
			{
				Integer j = map.get(a[i]);
				j++;
				map.put(a[i], j);
			}
		}
		System.out.println("Order of occurance");
		for(Entry<Integer, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
		System.out.println("Unique values");
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			Integer s = e.getValue();
			if(s==1)
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		System.out.println("Duplicate values");
		for(Entry<Integer, Integer> f:map.entrySet())
		{
			Integer w = f.getValue();
			if(w>1)
			{
				System.out.println(f.getKey()+" "+f.getValue());
			}
		}
		System.out.println("Print the position of number in array");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+"   "+a[i]);
		}
//		for(int j=0;j<list.size();j++)
//		{
//			System.out.println(list.get(j)+"   "+j);
//		}
	}
}
