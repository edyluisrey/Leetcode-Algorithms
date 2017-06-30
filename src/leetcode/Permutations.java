package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		Permutations test = new Permutations();
		System.out.println(test.permute(new int[]{1,2,3}));
	}
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		helper(nums,0,nums.length-1,list);
	    return list;
	}
	
	public void helper(int[] nums, int l, int tam, List<List<Integer>> list){       
	    if(l==tam){
	        List<Integer> newList= new ArrayList<>();
	        for(int i=0;i<=tam;i++){
	            newList.add(nums[i]);
	        }
	        list.add(newList); 
	    }else{
	        for(int j=l; j<=tam;j++){
	            nums= swap(nums,l,j);
	            helper(nums,l+1,tam,list);
	            nums = swap(nums,l,j);
	        }
	    }
	}
	
	public int[] swap(int[] nums,int i, int j){
	    int tem = nums[i];
	    nums[i]=nums[j];
	    nums[j]= tem;
	    return nums;
	}

}
