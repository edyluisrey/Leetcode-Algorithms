package leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement test = new RemoveElement();
		System.out.println(test.removeElement(new int[] {3,2,2,3,3,4}, 3));

	}
	
	public int removeElement(int[] nums, int val) {
        int len=0;
        for(int i=0; i< nums.length; i++){
        	if(nums[i]!=val){  
        		nums[len]=nums[i];
        		len++;
        	}		
        }  
        return len;
    }

}
