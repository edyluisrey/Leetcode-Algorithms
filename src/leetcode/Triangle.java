package leetcode;

import java.util.List;

public class Triangle {
	 public int minimumTotal(List<List<Integer>> triangle) {
	        int[] num= new int[triangle.size()+1];
	        for(int i= triangle.size()-1; i>=0;i--){
	            for(int j=0; j< triangle.get(i).size(); j++){
	                num[j]= Math.min(num[j],num[j+1])+ triangle.get(i).get(j);
	            }
	        }
	        return num[0];
	   }
}
