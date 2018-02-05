package leetcode2018;

import java.util.HashSet;
import java.util.Set;

public class LongestUncommonSubsequenceI {
	public int findLUSlength(String a, String b) {
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        int n1 =0;
        int n2 =0;
        for(Character c : a.toCharArray()) {
            setA.add(c);
        }
        
        for(Character c : b.toCharArray()) {
            setB.add(c);
        }
        
        for(Character c: a.toCharArray()) {
            if(!setB.contains(c))
                n1++;                
        }
        
        for(Character c: b.toCharArray()) {
            if(!setA.contains(c))
                n2++;                
        }
        if(n1 > 0 || n2 > 0){
            if(n1 > n2)
              return n1;
            else
              return n2; 
        }else
            return -1;
       
    }
}
