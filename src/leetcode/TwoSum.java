package leetcode;

public class TwoSum {

	public static void main(String[] args) {
 		
	   twoSum(new int[] {2, 7, 11, 15},9); 
	}
	
	static int[] twoSum(int[] nums, int target) {
	    int[] result = new int[2];
	     for (int i = 0; i < nums.length; i ++) {
	        int d = target - nums[i];
	        for (int j = i + 1; j < nums.length; j ++) {
	            if (nums[j] == d) {
	                result[0]=i;
	                result[1]=j;
	            }
	        }
	    }
	    return result;
	}

}
