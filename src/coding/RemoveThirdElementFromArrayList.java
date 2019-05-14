package coding;

import java.util.ArrayList;

public class RemoveThirdElementFromArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(23);
		ar.add(44);
		ar.add(12);
		ar.add(15);
		ar.add(10);
		
		//first print the third element 
		System.out.println("Third element before removing: " + ar.get(2));
		
		//remove method
		ar.remove(2);
		
		//printing new third elemement
		System.out.println("New third element: " + ar.get(2));
		

	}

}
