package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
	public static void main(String[] args){
		NextGreaterElementII test = new NextGreaterElementII();
		int[] r = test.nextGreaterElements(new int[]{1,2,1});
		System.out.println(Arrays.toString(r));
	}
	
	public int[] nextGreaterElements(int[] nums) {
	    Map<Integer, Integer> map =  new HashMap<>();
	    Stack<Integer> s= new Stack<>(); 
	    int j=0;
	    //for(int i=0; )
	}
}
