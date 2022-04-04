package arraylistEx;

import java.util.ArrayList;

public class arraylistEx2 {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList <Integer>();
		al.add(null);
		al.add(10);
		al.add(20);
	    al.add(1000);
		al.add(70);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(1));
		System.out.println(al.get(0));
		System.out.println(al.get(4));
		al.set(3,45000);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		
		
		
		


	}

}
