package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class LongestHarmoniousSubsequence {
	
	public static void main(String[] args){
		LongestHarmoniousSubsequence  test = new LongestHarmoniousSubsequence();
		System.out.println(test.findLHS(new int[]{1,3,2,2,5,2,3,7}));
		System.out.println(test.findLHS(new int[]{1,2,3,4})); // 2
		System.out.println(test.findLHS(new int[]{1,1,1,1})); // 0
	}
	
	public int findLHS(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i< nums.length; i++){
		   if(map.containsKey(nums[i])){
			   map.put(nums[i], map.get(nums[i])+1);
		   }else{
			   map.put(nums[i],1);
		   }	
		}
		int re= 0;
		for(int k: map.keySet()){
			if(map.containsKey(k+1)){
				re= Math.max(re, map.get(k)+ map.get(k+1));
			}
		}
		return re;
	    	
	}
}
