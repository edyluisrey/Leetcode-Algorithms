package leetcode;

public class ImplementstrStr {

	public static void main(String[] args) {
		

	}
	
	public int strStr(String haystack, String needle) {
		if(haystack.length()==0 && needle.length()==0) return 0;
		int n= haystack.length();
		int m= needle.length();
		if(m>n) return -1;
		if(m==0) return 0;
		int index=-1;
		for(int i=0; i<=n-m;i++){
		    if(haystack.charAt(i)==needle.charAt(0)){
		        boolean is= true;
		        int j=0;
		        while(j<m){
		            if(haystack.charAt(i+j)!=needle.charAt(j)){
		                is=false;
		                break;
		            }
		            j++;
		        }
		        if(is){
		            index=i;
		            break;
		        }
		    }
		}
		return index;
	}

}
