package coding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class HashSetToTreeSeTConversion {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(15);
		hs.add(10);
		hs.add(45);
		hs.add(100);
		hs.add(10);
		hs.add(5);
		
		System.out.println("The values of HashSet are:    " +hs);
	 
      	//conversion of hashset to treeSet
		
		TreeSet<Integer> ts = new TreeSet<>(hs);
	    System.out.println("HashSet converted to TreeSet: " + ts);
   
	}

}
