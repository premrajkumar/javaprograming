package org.Java_Practice;

public class TreeMap {

	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> map = new java.util.TreeMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3, "hello");//duplicate value is allowed
		//map.put(null, "abcd");//null key not allowed
		map.put(4, null);//allowed
		map.put(2, null);//allowed
		System.out.println(map);
		//RED BLACK TREE
	}

}
