package leetcode;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray test = new RotateArray();
		test.rotate(new int[]{1,2}, 1);
	}
	
	public void rotate(int[] nums, int k) {
		int n= nums.length;
		if(k>=n)
			k = k%n; 
		int t= n-k;
		int[] tem = new int[n];
		for(int i =0; i<k;i++){
			tem[i] = nums[t+i];
		}
		for(int i=k; i<n; i++){
			tem[i] =nums[i-k];
		}
		for(int i = 0; i<n; i++)
			nums[i]=  tem[i];
    }

}
