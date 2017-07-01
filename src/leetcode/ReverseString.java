package leetcode;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString  test = new ReverseString();
		System.out.println(test.reverseString("hello"));
	}
	
	public String reverseString(String s) {
		if(s.length()==0) return s;
		char[] str= s.toCharArray();
		int n= str.length;
		for(int i= 0; i<n/2;i++){
		    char temp = str[i];
		    str[i]=str[n-1-i];
		    str[n-1-i] = temp;
		}
		return String.valueOf(str);
	}

}
