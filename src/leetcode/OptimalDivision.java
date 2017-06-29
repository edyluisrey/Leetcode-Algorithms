package leetcode;

public class OptimalDivision {

	public static void main(String[] args) {
		OptimalDivision  test = new  OptimalDivision();
		System.out.println(test.optimalDivision(new int[]{1000,100,10,2}));

	}
	
	public String optimalDivision(int[] nums) {
		if(nums.length==0) return "";
	    if(nums.length==1) return ""+nums[0];
	    if(nums.length==2) return ""+nums[0]+"/"+nums[1]; 
	    StringBuilder str= new StringBuilder();
	    for(int i=1; i< nums.length; i++){
	        str.append(nums[i]+"/");
	    }
	    str.setLength(str.length()-1);
	    return ""+nums[0]+"/("+str.toString()+")";
	}

}
