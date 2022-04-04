package linkedlistsEx;

import java.util.LinkedList;

public class LinkedlistEx1 {

	public static void main(String[] args) {
		LinkedList <Integer> ll=new LinkedList <Integer>();
		ll.add(10);
		ll.add(23);
		ll.add(34);
		ll.add(40);
		ll.add(56);
		System.out.println(ll);
		ll.addFirst(5);
		System.out.println(ll);
		ll.addLast(30000);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.getLast());
		
		

	}

}
