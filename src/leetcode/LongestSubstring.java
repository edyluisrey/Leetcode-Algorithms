package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
		
	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		int left=0, right=0;
		Map<Character, Boolean> map = new HashMap();
		while (right < s.length()){
		    if (!map.containsKey(s.charAt(right)) || !(map.get(s.charAt(right)))){
		        map.put(s.charAt(right), true);
		        result = Math.max(result,right-left+1); 
		        right++;  
		    } else {
		        map.put(s.charAt(left), false);  
		        left++;  
		    }
		}
		result = Math.max(result,s.length()-left); 
		return result;
	}

}
