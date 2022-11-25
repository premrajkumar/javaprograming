package org.Java_Practice;


import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		set.add("hi");
		set.add("hello");
		set.add("hihello");
		set.add("google");
		set.add("wipro");
		set.add("infosys");
		System.out.println(set);
		System.out.println();
		for(String st:set)
		{
			System.out.println(st);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("infosys"));
		System.out.println(set.tailSet("google"));
	}

}
