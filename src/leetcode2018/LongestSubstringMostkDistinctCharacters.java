package leetcode2018;

import java.util.HashMap;

public class LongestSubstringMostkDistinctCharacters {
	
	public int lengthOfLongestSubstringTwoDistinct(String s) {
	    int k =2;
	    HashMap<Character, Integer> map = new HashMap<>();
	    int i =0;
	    int max=0;
	    for(int j = 0; j < s.length(); j++){
	        map.put(s.charAt(j), j);
	        if(map.size()>k){
	            while(i<j && map.get(s.charAt(i))!=i) i++;
	            map.remove(s.charAt(i++));
	        }
	        max = Math.max(max, j-i+1);
	    }
	    return max;
	}
}
