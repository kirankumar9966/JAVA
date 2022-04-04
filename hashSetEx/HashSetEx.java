package hashSetEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet <Integer> hs=new HashSet <Integer>(100,0.75f);
		hs.add(101);
		hs.add(101);
		hs.add(null);
	    hs.add(102);
	    hs.add(103);
	    System.out.println(hs);
	    for(Integer i:hs) {
	    	System.out.print(hs);
	    	ArrayList al=new ArrayList();
	    	al.add(al);
	    	Collections.sort(al);
	    	System.out.println(al);
	    	Collections.shuffle(al);
	    	System.out.println(al);
	    	
	    }
	}

		
}
