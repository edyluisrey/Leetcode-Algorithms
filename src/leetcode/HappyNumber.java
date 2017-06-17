package leetcode;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber test = new HappyNumber();
		System.out.println(test.isHappy(19));
	}
	
	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();
		while(!set.contains(n)){ 
			set.add(n);
			int sq= 0;
			while(n>0){
				int digit= n%10;
				sq+=digit*digit;
				n= n/10;
			}  System.out.println(sq);
			if(sq==1) return true;        	
			n=sq;
		}
		return false;
	}

}
