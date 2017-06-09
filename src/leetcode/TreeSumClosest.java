package leetcode;

import java.util.Arrays;

public class TreeSumClosest {

	public static void main(String[] args) {
		TreeSumClosest test = new TreeSumClosest();
		System.out.println(test.threeSumClosest(new int[] {0,2,1,-3}, 1));

	}
	
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = 0;
		int dist = Integer.MAX_VALUE;
		for(int i =0; i< nums.length; i++){
			int l = i+1;
			int r= nums.length-1;
			while(l<r){
			    int sum= nums[i] + nums[l] + nums[r];
			    int temp = Math.abs(sum- target);
			    if(temp< dist){
			    	dist= temp;
			    	result= sum; 
			    }
			    if(sum>target)
			    	r--;
			    else
			    	l++;
			}
		}
		return result;
    }

}
