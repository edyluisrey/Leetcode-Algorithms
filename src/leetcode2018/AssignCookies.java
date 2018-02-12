package leetcode2018;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		if(g.length == 0 || s.length == 0) return 0;
		mergeSort(g, 0, g.length-1);
		mergeSort(s, 0, s.length-1);
		int i = 0;
		for(int j = 0; i< g.length && j< s.length; j++){
		    if(g[i] <= s[j])
		       i++;
		}
		return i;
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
