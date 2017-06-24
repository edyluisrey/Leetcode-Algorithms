package leetcode;

public class GuessNumberHigherorLower {
	public static void main(String[] args){
		
	}
	
	public int guessNumber(int n) {
		int l=1, r=n;
		while(l<=r){
			int m = l+((r-l)/2);
			int g= guess(m);
			if(g==0) return m;
			if(g<0){
				r=m-1;
			}
			if(g>0)
			   l=m+1;
			
		}
		return -1;
	}
	
	public int guess(int m){
		return 0;
	}
}
