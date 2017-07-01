package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void moveZeroes(int[] nums) {
	    for(int i=0; i<nums.length-1;i++ ){
	        if(nums[i]==0 && nums[i+1]!=0){
	            int temp=nums[i];
	            nums[i]= nums[i+1];
	            nums[i+1]= temp;
	        }
	        
	        while(i>0 && nums[i-1]==0 && nums[i]!=0){
	            int temp = nums[i];
	            nums[i]= nums[i-1];
	            nums[i-1]=temp;
	            i--;
	        }
	        
	    }
	}  

}
