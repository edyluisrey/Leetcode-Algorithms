package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("XIV"));
	}
	
	public static int romanToInt(String s){
		Map<Character, Integer> map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int previous, current;
		int result = map.get(s.charAt(0));
		for(int i = 1; i < s.length(); i++){
			previous = map.get(s.charAt(i-1));
			current = map.get(s.charAt(i));   
			result = previous<current? result - previous + (current-previous):result+current;
		}
		return result;
	}

}

