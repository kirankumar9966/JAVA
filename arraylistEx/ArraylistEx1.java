package arraylistEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList <Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(60);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		
		
		
		
		

	}

}
