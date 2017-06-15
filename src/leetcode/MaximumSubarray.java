package leetcode;

import java.util.Arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		MaximumSubarray test = new MaximumSubarray();
		System.out.println(test.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(test.maxSubArray(new int[]{-1}));

	}
	
	public int maxSubArray(int[] nums) {
	    if(nums.length==0) return 0;
	    int[] sum = new int[nums.length];
	    sum[0]=nums[0];
	    for(int i =1; i< nums.length;i++){
	    	sum[i]= Math.max(sum[i-1]+nums[i],nums[i]);
	    }  System.out.println(Arrays.toString(sum));
	    int res= sum[0];
	    for(int i=1; i<sum.length;i++){
	    	if(res<sum[i])
	    		res= sum[i];
	    }
	    return res;
	}

}
