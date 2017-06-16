package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args){
		SingleNumber test = new SingleNumber();
		System.out.println(test.singleNumber(new int[]{2,1,2,1,5,6,6}));
	}
	
	public int singleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i: nums){
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		for(Map.Entry e: map.entrySet()){ 
			if((int)e.getValue()==1)
				return (int)e.getKey();
		}
		return 0;
	}
}
