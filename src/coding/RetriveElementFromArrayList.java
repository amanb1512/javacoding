package coding;

import java.util.ArrayList;

public class RetriveElementFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(23);
		ar.add(44);
		ar.add(12);
		ar.add(15);
		ar.add(10);
		
		//to retrieve element from arraylist at a specified index
		
		System.out.println("The element present at index number 2 is :" + ar.get(2));
		
		

	}

}
