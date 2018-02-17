package leetcode2018;

import java.util.HashMap;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		   HashMap<Character, Integer> map = new HashMap<>();
		   for(char c: s.toCharArray()){
			   if(map.containsKey(c)){
				   map.put(c,map.get(c)+1);
			   }else{
				   map.put(c,1);
			   }
		   }
		   int cont=0;
		   for(char c: map.keySet()){
			   if(map.get(c)>1){
		           if(map.get(c)%2==0)
				     cont= cont+ map.get(c);
		           else
		             cont = cont + (map.get(c)-1);  
			   }
		   }
		   if(cont<s.toCharArray().length)
			   cont= cont+1;
			   
		   return cont;   
	}
}
