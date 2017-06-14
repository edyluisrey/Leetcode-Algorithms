package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate test = new ContainsDuplicate();
		System.out.println(test.containsDuplicate(new int[] {1,2,3,1}));

	}
	
	public boolean containsDuplicate(int[] nums) {
	    Map<Integer,Integer> map = new  HashMap<>();
	    for(int n:nums){
	        if(map.containsKey(n))
	             return true;
	        map.put(n,0);         
	    }
	    return false;
	}

}
