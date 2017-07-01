package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> fizzBuzz(int n) {
	    List<String>  result=  new ArrayList<String>();
	    for(int i=1;i<=n;i++){
	        if(i%3==0 || i%5==0){
	            if(i%3==0 && i%5==0){
	                result.add("FizzBuzz");
	            }else if(i%3==0){
	                 result.add("Fizz");
	            }else{
	                result.add("Buzz");
	            }
	        }else{
	            result.add(""+i);
	        }
	        
	    }
	    return result;
	}

}
