package leetcode;

import java.util.Arrays;

public class TwoSumIInputarrayissorted {

		public static void main(String[] args) {
		    TwoSumIInputarrayissorted test = new TwoSumIInputarrayissorted();
		    System.out.println(Arrays.toString(test.twoSum(new int[]{1,3,5,6},9)));
		}
		
		public int[] twoSum(int[] numbers, int target) {
		    int l =0;
		    int h= numbers.length-1;
		    int[] re= new int[2];
		    while(l<h){
		        int sum= numbers[l]+numbers[h];
		        if(sum<target){
		           l++;
		        }
		        if(sum>target){
		           h--;
		        }
		        if(sum==target){
		            re[0]=l+1;
		            re[1]=h+1;
		            return re;
		        }
		    }
		    return re;   
		}

}
