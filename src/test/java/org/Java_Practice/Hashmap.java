package org.Java_Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3, "hello");//duplicate value is allowed
		map.put(null, "abc");
		map.put(null, "abcd");//one null key allowed
		map.put(4, null);//allowed
		map.put(2, null);//allowed
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.replace(5, "automation"));
		System.out.println(map.get(10));
		System.out.println(map);
		System.out.println();
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}
}
