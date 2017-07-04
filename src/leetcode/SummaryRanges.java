package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	 public List<String> summaryRanges(int[] nums) {
	        List<String> list = new ArrayList<>();
	        for(int i=0; i < nums.length;i++){
	            int start= nums[i];
	            int init =i;
	            while(i< nums.length-1 && (nums[i]+1)==nums[i+1]){
	                i++;
	            }
	            if(i!=init){
	                list.add(start+ "->"+ nums[i]);
	            }else{
	                list.add(start+"");
	            }
	        }
	        return list;
	    }

}
