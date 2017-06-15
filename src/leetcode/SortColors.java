package leetcode;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		SortColors test = new SortColors();
		test.sortColors(new int[] {1,2,2,0,0});

	}
	
	public void sortColors(int[] nums) {
		int len = nums.length;
		for(int i = 0; i < len; ++i) {
			for(int j = 0; j < len-1; ++j) {	
				if(nums[j] > nums[j+1]){		
					int temp = nums[j];		
					nums[j] = nums[j+1];		
					nums[j+1] = temp;		
				}	
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
