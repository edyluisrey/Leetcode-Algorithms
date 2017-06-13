package leetcode;

import java.util.Arrays;

public class ReshapetheMatrix {
	public static void main(String[] args){
		int[][] nums = new int[][] {{1,2},{3,4}};
		ReshapetheMatrix test = new ReshapetheMatrix();
		int[][] res= test.matrixReshape(nums, 1, 4);
		System.out.println(Arrays.toString(res[0]));
	}
	public int[][] matrixReshape(int[][] nums, int r, int c) { 
		  if(nums==null || nums.length==0) return nums; 
		  int a =nums.length; int b=nums[0].length;
	      int total = a*b; 
	      int[][] res = new int[r][c];
	      if((r*c)==total){
	    	  int co=0, ro=0;
	    	 for(int i =0; i< a;i++){
	    		 for(int j= 0; j< b; j++){
	    			 res[ro][co]= nums[i][j];
	    			 co++;
	    			 if(co==c){
	    				 co=0;
	    				 ro++;
	    			 }
	    		 }
	    	 }
	      }else
	    	  return nums;
	     return res; 
	}
}
