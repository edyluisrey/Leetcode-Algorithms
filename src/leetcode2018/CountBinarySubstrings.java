package leetcode2018;

public class CountBinarySubstrings {
	
	 public int countBinarySubstrings(String s) {
		int t=0;
		int n=0; 
		int m=1;
		for(int i = 1; i< s.length(); i++){  
		    if(s.charAt(i-1) == s.charAt(i)){
		       m++;  
		    }else{
		        t+= Math.min(n, m);
		        n= m;
		        m=1;
		    }                   
		}
		t+= Math.min(n, m);
		return t;
	 }

}
