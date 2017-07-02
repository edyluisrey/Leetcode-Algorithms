package leetcode;

public class SumofSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean judgeSquareSum(int c) {
	        int limit = helper(c);
	        int r =limit;
	        for(int i=0; i<=limit && r>=i;){
	            int sum =i*i + r*r;
	            if(sum==c){
	                return true;
	            }else if(sum<c){
	                i++;
	            }else{
	                r--;
	            }
	        }
	        
	        return false;
	    }
	    
	    public int helper(int x){
	        if(x<=1) return x;
	        int start=0, end=x;
	        while(start<=end) {
	            int mid = start + (end-start)/2;
	            if(x/mid==mid) 
	                return mid;
	            else if(x/mid<mid)
	                end = mid-1;
	            else
	                start = mid+1;
	        }
	        return end; 
	    }

}
