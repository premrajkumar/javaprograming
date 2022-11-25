package org.Java_Practice;

public class Hashtable {
	public static void main(String[] args) {
		java.util.Hashtable<Integer, String> map = new java.util.Hashtable<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3, "hello");//duplicate value is allowed
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.contains("bye"));
		System.out.println(map.replace(5, "automation"));
		System.out.println(map.get(10));
		System.out.println(map);
	}

}
