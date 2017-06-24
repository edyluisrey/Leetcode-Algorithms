package leetcode;

public class BeautifulArrangement {
    
	int sum=0;
	public static void main(String[] args) {
		BeautifulArrangement  test = new BeautifulArrangement();
		System.out.println(test.countArrangement(2));

	}
	
	public int countArrangement(int N) {
	      boolean[] v = new boolean[N+1];
	      arrangement(N,1, v);
	      return sum;
	}
	
	public void arrangement(int n, int pos, boolean[] v){
		 if(pos > n){
			 sum++;  
			// return;
		 } 
		 for(int i=1; i<=n; i++){
			 if(!v[i] && (i%pos==0 || pos%i==0)){
				 v[i]=true;  
				 arrangement(n,pos+1, v);
				 v[i]=false; 
			 }
		 }
	}

}
