package leetcode;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length; i++){
            xor = xor^(i+1)^nums[i];
        }
        
        return xor;
    }

}
