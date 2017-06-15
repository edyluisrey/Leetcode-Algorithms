package leetcode;

public class HouseRobber {

	public static void main(String[] args) {
		HouseRobber test = new HouseRobber();
		System.out.println(test.rob(new int[]{2,15,5,16}));

	}
	
	public int rob(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int[] max = new int[nums.length];
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        max[0]= nums[0];
        max[1]= Math.max(nums[0], nums[1]);
        for(int i = 2; i< nums.length; i++){
        	max[i]= Math.max(max[i-2]+nums[i], max[i-1]);
        }
        return max[nums.length-1];
    }

}
