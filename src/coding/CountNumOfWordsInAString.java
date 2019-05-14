package coding;

import java.util.HashMap;

public class CountNumOfWordsInAString {
	
    static void countWords(String str) {
		
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
		
		
	}

	public static void main(String[] args) {
		
		countWords("javacodingisfun");
		

	}

}
