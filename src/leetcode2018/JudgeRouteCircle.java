package leetcode2018;

import java.util.HashMap;
import java.util.Map;

public class JudgeRouteCircle {
	public boolean judgeCircle(String moves) {
        if(moves.length()==0) return false;
        Map<Character, Integer> map = new HashMap<>();
        map.put('L',-1);
        map.put('U',1);
        map.put('R',1);
        map.put('D',-1); 
        int x=0; int y=0;
        for(Character c: moves.toCharArray()){
            if(c=='L' || c=='R') x+=map.get(c); 
            else y+= map.get(c);
        }
        return x==0 && y==0;
    }
}
