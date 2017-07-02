package leetcode;

public class SumofTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int getSum(int a, int b) {
		while(b!=0){
		    int carry = a & b;
		    a = a^b;
		    b = carry<< 1;  
		}
		return a;
	 }

}
