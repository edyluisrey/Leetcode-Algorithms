package leetcode2018;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	
	public int distributeCandies(int[] candies) {
	      Set<Integer> set = new HashSet<>();
	      for(int i: candies){
	          set.add(i);
	      } 
	      return set.size();  
	}
}
