package leetcode2018;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list=  new ArrayList<>();
		for(int i = left; i<=right; i++){
		    if(selfDividing(i))
		        list.add(i);
		}
		return list;
	}
	
	public boolean selfDividing(int n){
		int temp=n;
		while(n>9){
		    int d = n%10;
		    n=n/10;
		    if(d==0 || temp%d!=0)
		        return false;
		}
		if(temp%n!=0)
		    return false;
		return true;
	}
}
