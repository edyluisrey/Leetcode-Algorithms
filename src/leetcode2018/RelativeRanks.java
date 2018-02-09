package leetcode2018;

import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
	
	public String[] findRelativeRanks(int[] nums) {
		Map<Integer,String> map = new HashMap<>();
		String[] str = new String[nums.length];
		int n =  nums.length-1;
		int[] copy = new int[n+1];
		for(int i=0; i<= n; i++){
		    copy[i]= nums[i];
		}
		
		mergeSort(nums, 0, nums.length-1);      
		
		for(int i=0; i< nums.length; i++){
		    if(i==0){
		        map.put(nums[n-i], "Gold Medal");
			}
			else if(i==1){
			    map.put(nums[n-i], "Silver Medal");
			}
			else if(i==2){
			    map.put(nums[n-i], "Bronze Medal");
			}
			else{
			    map.put(nums[n-i], (i+1)+"");
			}
		}
		for(int i=0; i< copy.length; i++){
		    str[i] = map.get(copy[i]); 
		}
		
		return str;
	}
    
    public void mergeSort(int[] nums, int l, int p){
        if(l==p){
            return;
        }
        int mid = (l+p)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, p);
        merge(nums, l, mid+1, p);
    }
    
    public void merge(int[] nums, int left, int mid, int rightEnd){
        int right = mid;  
        int k=0;
        int n= rightEnd-left+1;
        int lower =left;
        int[] temp= new int[n]; 
        while(left<=mid-1 &&  right<= rightEnd){
        	if(nums[left]<=nums[right]){
        		temp[k++]= nums[left++];
        	}else{
        		temp[k++]= nums[right++];
        	}
        } 
        while(left<=mid-1){
        	temp[k++]= nums[left++];
        }
        while(right<=rightEnd){
        	temp[k++]= nums[right++];
        }
        
        for(int i=0; i<n;i++){
        	nums[lower+i] = temp[i];
        }
    	
    }

}
