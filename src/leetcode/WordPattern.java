package leetcode;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		WordPattern test = new WordPattern();
		System.out.println(test.wordPattern("abba", "dog cat cat dog"));
		System.out.println(test.wordPattern("abba", "dog cat cat fish"));
		System.out.println(test.wordPattern("abba", "dog dog dog dog"));

	}
	
	public boolean wordPattern(String pattern, String str) {	    
	    HashMap<Character,String> map = new HashMap<>();
	    int i=0;
	    String[] arrayStr = str.split(" ");
	    char[] arrayPattern = pattern.toCharArray();
	    if(arrayPattern.length !=arrayStr.length) return false;
	    for(char c: arrayPattern){
	    	if(map.containsKey(c)){
	    		if(!arrayStr[i].equals(map.get(c))){  
	    			return false;
	    		} 
	    	}else if(map.containsValue(arrayStr[i])){  
	    		return false;
	    	}
	    	map.put(c,arrayStr[i]);
	    	i++;
	    }
	    return true;
	}

}
