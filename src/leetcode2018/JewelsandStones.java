package leetcode2018;

import java.util.HashSet;
import java.util.Set;

public class JewelsandStones {
	
	public int numJewelsInStones(String J, String S) {
		int total=0;
		Set<Character> set =  new HashSet<>();
		for(char s: J.toCharArray()){
		    set.add(s);
		}
		for(char s: S.toCharArray()){
		    if(set.contains(s))
		        total++;
		}
		return total;
    }
}
