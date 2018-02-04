package leetcode2018;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	
	 public int distributeCandies(int[] candies) {
	      Set<Integer> set =  new HashSet<>();
	      int  n = candies.length;    
	      for(int i: candies){
	          set.add(i);
	      } 
	      if((set.size()-(n/2))>0){
	          return n/2;
	      }else
	        return set.size(); 
	 }
}
