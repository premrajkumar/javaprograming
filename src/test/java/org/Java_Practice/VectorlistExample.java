package org.Java_Practice;

import java.util.Vector;

public class VectorlistExample {

	public static void main(String[] args) {
		Vector<Object> list = new Vector<Object>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.firstElement());
		System.out.println(list.lastElement());
		System.out.println(list.indexOf("hi"));
		list.add(4, "hello");
		System.out.println(list);
		

	}

}
