package leetcode2018;

public class NondecreasingArray {
	public boolean checkPossibility(int[] nums) {
        if(nums.length==0) return true;
        int n=0; 
        int temp=nums[0];
        for(int i = 1; i<  nums.length; i++){
            if(temp> nums[i]) n++;
            temp= nums[i];
            if(n>1) return false;
        }
        return true;
    }
}
