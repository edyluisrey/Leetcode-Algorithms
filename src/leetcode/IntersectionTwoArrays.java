package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionTwoArrays {
	
	public static void  main(String[] args){
		IntersectionTwoArrays test = new IntersectionTwoArrays();
		int[] res = test.intersection(new int[]{1}, new int[]{1,1});
		System.out.println(Arrays.toString(res));
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		    Set<Integer> set = new HashSet<Integer>();
		    for(int i =0; i < nums1.length; i++){
		       	set.add(nums1[i]);
		    }
		    Set<Integer> set2 = new HashSet<>();
		    for(int i=0; i<nums2.length; i++){
		    	if(set.contains(nums2[i]))
		    		set2.add(nums2[i]);
		    }
		    int[] res = new int[set2.size()];
		    int k=0;
		    Iterator<Integer> it = set2.iterator();
		    while(it.hasNext()){
			   res[k]= it.next();
			   k++;
		    }
		    return res;
    }
}


