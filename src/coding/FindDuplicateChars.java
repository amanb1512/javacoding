package coding;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateChars {
	
	static void findDuplicateCharacters(String str) {
		
		//store it in hashmap and then display
    	HashMap<Character, Integer> hm = new HashMap<>();
    	
    	for(int i = 0; i < str.length(); i++) {
    		Character ch =  str.charAt(i);
    		
    	  if(hm.get(ch)!=null) {
    		  hm.put(ch, hm.get(ch)+1);
    	  }
    	  else
    		  hm.put(ch, 1);
    		
    		 }
    	System.out.println(hm);
    	
    	Iterator <Character> tempChar= hm.keySet().iterator();
    	   while(tempChar.hasNext()) {
    		  Character c =  tempChar.next();
    		   if(hm.get(c) > 1) {
    			   System.out.println(c + " = " + hm.get(c));
    		   }
    	   }
 
		
		}
            		
		
	

	public static void main(String[] args) {
	
		findDuplicateCharacters("findduplicatesinthisstring");

	}

}
