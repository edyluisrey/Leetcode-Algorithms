package leetcode;

public class NumArray {
	private int[] sums;
	public static void main(String[] args) {
		NumArray test = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
		System.out.println(test.sumRange(0, 2));
		System.out.println(test.sumRange(2, 5));
		System.out.println(test.sumRange(0, 5));

	}
	
	public NumArray(int[] nums) {
		sums = new int[nums.length];
		if(nums.length>0)
		    sums[0]= nums[0];
        for(int i=1; i<nums.length; i++)
        	sums[i] = sums[i-1]+ nums[i];
    }
    
    public int sumRange(int i, int j) {
    	if(i==0) return sums[j];
        return sums[j]-sums[i-1];
    }

}
