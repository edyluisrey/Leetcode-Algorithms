package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring lp = new LongestPalindromicSubstring(); 
		System.out.println(lp.longestPalindrome("babad")); 
		System.out.println(lp.longestPalindrome("bbb"));
		System.out.println(lp.longestPalindrome("a"));
		System.out.println(lp.longestPalindrome("cbbd"));
	}
	public String longestPalindrome(String s) {
		int len= s.length();
		if(len<2)  return s;
		
		String longPalindrome="",temp="";
		for(int i=0;i<len;i++){
			temp=getPalindrome(s,i,i);
			if(temp.length()> longPalindrome.length())
			  longPalindrome= temp;
			
			temp=getPalindrome(s,i,i+1);
			if(temp.length()> longPalindrome.length())
			  longPalindrome= temp;
		}
		return longPalindrome;
	}
	
	public String getPalindrome(String s,int leftIndex,int rightIndex){
		while(leftIndex>=0 && rightIndex<s.length() && s.charAt(leftIndex)==s.charAt(rightIndex)){
			leftIndex--;
			rightIndex++;
		}
		return s.substring(leftIndex+1,rightIndex);
	}

}
