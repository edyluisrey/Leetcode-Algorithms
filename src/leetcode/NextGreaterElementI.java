package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
		
	public static void main(String[] args){
		NextGreaterElementI test = new NextGreaterElementI();
		int[] r = test.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
		System.out.println(Arrays.toString(r));
    }
	
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] r= new int[findNums.length];	   
		Stack<Integer> s= new Stack<>();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++){
			while(!s.isEmpty() && nums[i]> s.peek()){
				map.put(s.pop(), nums[i]);
			}
			s.push(nums[i]);
		}
		
		for(int i=0; i< findNums.length;i++){
			int val= (map.get(findNums[i])!=null)?map.get(findNums[i]):-1;
			r[i]= val;
		}
		return r; 
	}
}
