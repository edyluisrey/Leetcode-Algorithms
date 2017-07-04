package leetcode;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
	    int cont =0;
	    int max=0;
	    for(int i =0; i<nums.length; i++){
	        if(nums[i]==1) {
	            cont++;
	            max= Math.max(max, cont);
	        }
	        else{                
	            cont=0;
	        }
	    }
	    return max;
	}
}
