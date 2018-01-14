package leetcode2018;

import java.util.HashMap;
import java.util.Map;

public class AnagramMappings {
	
	public int[] anagramMappings(int[] A, int[] B) {
        if(A.length!=B.length) return new int[0];
        int[] P= new int[A.length];
        Map<Integer, Integer>  map = new HashMap<>();
        for(int i=0; i< B.length;i++){
            map.put(B[i],i);
        }
        for(int i=0; i<A.length; i++){
            P[i]= map.get(A[i]);
        }
        return P;
    }
}
