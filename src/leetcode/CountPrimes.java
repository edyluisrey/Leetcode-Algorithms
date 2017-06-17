package leetcode;

public class CountPrimes {

	public static void main(String[] args) {
		CountPrimes test = new CountPrimes();
		System.out.println(test.countPrimes(8));

	}
	
	public int countPrimes(int n) {
		boolean[] prime = new boolean[n];
		for(int i=0;i<n;i++)
			 prime[i] = true;
		for (int i = 2; i < n; i++) {
		    if (prime[i]) {
		        for (int j = 2; i*j < n; j++) {
		            prime[i*j] = false;  
		        }
		    }
		}
		int cont=0;
		for(int i=2; i<n; i++){
			if(prime[i])
				cont++;
		}
			
		return cont;
	}
	

}
