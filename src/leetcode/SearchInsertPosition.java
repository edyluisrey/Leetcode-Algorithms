package leetcode;

public class SearchInsertPosition {
	public static void main(String[] args){
		SearchInsertPosition test =  new SearchInsertPosition();
		System.out.println(test.searchInsert(new int[] {1,3,5,6}, 2));
	}
	
	public int searchInsert(int[] nums, int target) {
		int l=0, h=nums.length-1;              
		while(l<h){
			int mid = (l+h)/2;
			if(target> nums[mid]){
				l = mid+1;
			}else{
				h=mid;
			}
		}
		return h;
	    
	}
}
