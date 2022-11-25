package org.Java_Practice;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Object> st = new Stack<Object>();//LIFO 
		st.push(20);
		st.push(10);
		st.push(40);//Last In
		System.out.println(st.pop());//40 //First out
		System.out.println(st.pop());//10
		System.out.println(st.pop());//20
	}

}
