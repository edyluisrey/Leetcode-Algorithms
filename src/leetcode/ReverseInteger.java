package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));

	}
	
	public static int reverse(int x) {
	       int newNumber =x;
	       long reverse=0;
	       while(newNumber!=0){
	    	   reverse=reverse*10+newNumber%10;
	    	   newNumber=newNumber/10;
	       }   
	       if(reverse<Integer.MIN_VALUE || reverse> Integer.MAX_VALUE)
	    	   return 0;
	       else
	    	   return (int)reverse;
	}

}