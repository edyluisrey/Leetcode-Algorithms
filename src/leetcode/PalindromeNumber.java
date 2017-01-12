package leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(-11));
		System.out.println(isPalindrome(121));

	}
	public static boolean isPalindrome(int x) {
		int newNumber =x;
		int reverse=0;
		while(newNumber>0){
			reverse= reverse*10+newNumber%10;
			newNumber= newNumber/10;
		}
		if(reverse==x)
			return true;
		else
			return false;
    }

}
