package leetcode;

public class MergeSortedArray {

	public static void main(String[] args) {


	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		   int[] num = new int[m+n];
		   int i =0;
		   int j=0;
		   int k=0;
		   while(i<m && j<n){
		      if(nums1[i]<=nums2[j]){
		          num[k++]=nums1[i++];
		      }else{
		          num[k++]= nums2[j++];
		      }
		   }
		   
		   while(i<m){
		       num[k++]=nums1[i++];
		   }
		   
		   while(j<n){
		       num[k++]=nums2[j++];
		   }
		   
		   for(int ii=0; ii<k;ii++){
		       nums1[ii]=num[ii];
		   }
	       
	   }

}
