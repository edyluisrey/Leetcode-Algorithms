package leetcode;

public class ArrayPartitionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		public int arrayPairSum(int[] nums) {
		    mergeSort(nums,0, nums.length-1); 
		    int sum=0;
		    for(int i=0; i< nums.length; i+=2){
		        sum= sum+ nums[i];
		    }
		    return sum;
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
