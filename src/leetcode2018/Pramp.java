package leetcode2018;

public class Pramp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGrantsCap(new int[]{2, 100, 50, 120, 1000}, 190));
	}
	
	static int findGrantsCap(int[] nums, int n){
		return helper(nums,n,0,false) ;
	}
	
	static int helper(int[] nums, int n, int rest, boolean finish){
		if(finish){
			return 0;
		} 
		int total=0;
		for(int i=0; i< nums.length;i++){
			if(nums[i]<= n/(nums.length-rest) && nums[i]!=-1){
				n-=nums[i];
				nums[i]=-1;
				rest++;
				total++;
			}
		}
		if(total==0) finish= true;
		helper(nums,n,rest, finish);
		int last=n/(nums.length-rest);
		return last;
	}

}
