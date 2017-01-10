package leetcode;

public class HammingDistance {

	public static void main(String[] args) {
		
		System.out.println(totalHammingDistance(new int[]{4,14,2}));
	}
	
	public static int totalHammingDistance(int[] nums) {
	    int total=0;
	    for(int i=0;i<32;i++){
	    	int one=0,zero=0;
	    	for(int j=0;j<nums.length;j++){
	    		if(((1<<i) & nums[j])!=0)  
	    			one++;
	    		else 	
	    			zero++;
	    	}
	    	total+=one*zero;
	    }
	    return total;        
	}

}
