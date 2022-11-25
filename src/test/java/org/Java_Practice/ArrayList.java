package org.Java_Practice;

import java.util.Collections;

public class ArrayList {

	public static void main(String[] args) 
	{
		java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.add(2,"java");
		System.out.println(list);
		java.util.ArrayList<Integer> list2=new java.util.ArrayList<Integer>();
		list2.add(20);
		list2.add(5);
		list2.add(1);
		list2.add(30);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		if(list.contains("hi"))
		{
		System.out.println("is present");	
		}
		else
		{
			System.out.println("not present");
		}
		System.out.println(list.remove(1));
		for(Object s:list)
		{
			System.out.println(s);
		}
	}
}
