package leetcode2018;

public class CountBinarySubstrings {

	 public int countBinarySubstrings(String s) {
		int t=0;
		for(int i =0; i< s.length(); i++){
		    int n=i+1;
		    while(n< s.length() && s.charAt(n) == s.charAt(i)){
		       n++;    
		    }
		    int m=n+1;
		    while(m< s.length() && s.charAt(m) == s.charAt(n)){
		        m++;
		    }
		    if((n-i)==(m-n)){
		        t++;
		    }            
		}
		return t;
	 }

}
