package leetcode2018;

import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {
	public char findTheDifference(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c: s.toCharArray()){
		    map.put(c, map.getOrDefault(c,0)+1);
		}
		for(char c: t.toCharArray()){
		    if(map.containsKey(c)){
		        map.put(c,map.get(c)-1);
		        if(map.get(c) < 0)
		            return c;
		    }
		    else{
		        return c;
		    }
		        
		}
		return ' ';
    }
}
