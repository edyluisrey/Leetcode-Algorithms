package leetcode;

import java.util.List;

public class MaximumDistanceinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// reference: https://leetcode.com/articles/maximum-distance-in-array/
	public int maxDistance(List<List<Integer>> arrays) {
	      int res= 0; 
	      int c_min = arrays.get(0).get(0);
	      int c_max= arrays.get(0).get(arrays.get(0).size()-1);
	      for(int i=1; i< arrays.size();i++){
	          res= Math.max(res,Math.max(Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-c_min),Math.abs(c_max-				arrays.get(i).get(0))));
	          c_min= Math.min(c_min,arrays.get(i).get(0));
	          c_max= Math.max(c_max, arrays.get(i).get(arrays.get(i).size()-1));
	      }  
	      return res;  
	}

}
