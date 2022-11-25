package org.Java_Practice;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("hi");
		queue.add("hello");
		queue.add("hihello");
		queue.add("bye");
		queue.add("goodBye");
		System.out.println(queue);
		System.out.println(queue.peek());// will fetch and not remove
		System.out.println(queue);
		System.out.println(queue.poll());//will fetch and remove
		System.out.println(queue);
	}

}
