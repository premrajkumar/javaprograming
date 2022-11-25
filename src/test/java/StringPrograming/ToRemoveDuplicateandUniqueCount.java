package StringPrograming;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ToRemoveDuplicateandUniqueCount {
	@Test
	public void remove()
	{
		int[] a= {4,3,2,3,1};
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
		System.out.println("Unique values with count");
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			Integer s = e.getValue();
			if(s==1)
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		System.out.println("Duplicate values with count");
		for(Entry<Integer, Integer> f:map.entrySet())
		{
			Integer w = f.getValue();
			if(w>1)
			{
				System.out.println(f.getKey()+" "+f.getValue());
			}
		}
		System.out.println("Print the position of number with duplicate");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+"   "+a[i]);
		}
		System.out.println("Unique values ");
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			Integer s = e.getValue();
			if(s==1)
			{
				System.out.println(e.getKey()+" ");
			}
		}
		System.out.println("Duplicate values");
		for(Entry<Integer, Integer> f:map.entrySet())
		{
			Integer w = f.getValue();
			if(w>1)
			{
				System.out.println(f.getKey()+" ");
			}
		}
		System.out.println("Position of Each number without duplicates");
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		 for(int i=0;i<a.length;i++)
		 {
			 set.add(a[i]);
		 }
		 ArrayList<Integer> s1 = new ArrayList<>(set);
		 for(int j=0;j<s1.size();j++)
		 {
			 System.out.println(s1.get(j)+"  "+(j+1));
		 }
	}

}
