package org.Java_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	TreeSet<Integer> set = new TreeSet<Integer>();
	set.add(10);
	set.add(7);
	set.add(9);
	set.add(20);
	set.add(2);
	set.add(50);
	set.add(30);
	System.out.println(set);
	ArrayList<Object> list = new ArrayList<Object>(set);
	list.add("hi");
	list.add("hello");
	list.add("bye");
	list.add(10);
	System.out.println(list);
	System.out.println(list.get(4));
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(list.remove(3));
	System.out.println(list.set(3, "hihello"));
	System.out.println(set.descendingSet());
	System.out.println();
	Iterator<Object> i = list.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
