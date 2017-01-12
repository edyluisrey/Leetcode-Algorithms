package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("babad")); 
		System.out.println(longestPalindrome("bbb"));
		System.out.println(longestPalindrome("cbbd"));
	}
	public static String longestPalindrome(String s) {
        int len= s.length();
        if(len<2)  return s;
        
        String longPalindrome="",temp="";
        int rightIndex=0,leftIndex=0;
        for(int i=0;i<len;i++){
        	rightIndex= i%2==0?i:i+1;
        	leftIndex =i;
        	while(leftIndex>=0 && rightIndex<len && s.charAt(leftIndex)==s.charAt(rightIndex)){
        		leftIndex--;
        		rightIndex++;
        	}
        	
        	temp=s.substring(leftIndex+1,rightIndex);
        	if(temp.length()> longPalindrome.length())
        	  longPalindrome= temp;
        }
        return longPalindrome;
    }

}
