package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicatesfromSortedArray  test = new RemoveDuplicatesfromSortedArray();
		System.out.println(test.removeDuplicates(new int[]{1,1,3,4,4,4,5}));
	}
	
	public int removeDuplicates(int[] nums) {
        int len=0; int index=0;
        for(int i=0;i< nums.length-1; i++){
        	if((nums[i]-nums[i+1]) ==0){
        		len++;
        	}else{
        		nums[++index]=nums[i+1];
        	}
        }  //System.out.println(Arrays.toString(nums));
        return nums.length-len;
    }

}
