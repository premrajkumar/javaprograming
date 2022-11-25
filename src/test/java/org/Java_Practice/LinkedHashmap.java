package org.Java_Practice;

import java.util.LinkedHashMap;

public class LinkedHashmap {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
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
}
}
