package leetcode2018;

import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] ops) {
	    Stack<Integer> stack = new Stack<>();
	    stack.push(0);
	    int sum=0;
	    int valid=0;
	    for(String s: ops) {
	        if(Character.isDigit(s.charAt(0))) {
	            stack.push(Integer.parseInt(s));
	        } else if(s.equals("+")) {
	            if(stack.size()>1) {
	                int temp= stack.pop();
	                valid= temp+ stack.peek();
	                sum+=valid;
	                stack.push(temp);
	                stack.push(valid);
	            } else { 
	                sum+=stack.peek();
	                stack.push(stack.peek());
	            }
	                
	        }else if(s.equals("D")){
	            valid= stack.peek()*2;
	            sum+=valid;
	            stack.push(valid);
	            
	        }else if(s.equals("C")){
	            valid= stack.pop();
	            sum-=valid;
	        }
	    }
	    return sum;
    }
}
