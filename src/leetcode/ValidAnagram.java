package leetcode;

import java.util.Arrays;

public class ValidAnagram {
   public static void main(String[] args){
	   ValidAnagram  test = new ValidAnagram();
	   System.out.println(test.isAnagram("anagram", "nagaram"));
   }
   public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;
       char[] s1= s.toCharArray();
       Arrays.sort(s1);
       char[] s2 = t.toCharArray(); 
       Arrays.sort(s2);
       for(int i =0; i< s.length();i++){
    	   if(s1[i]!=s2[i]){   
    		   return false;
    	   }   
       }
       return true;
   }
}
