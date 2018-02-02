package leetcode2018;

import java.util.Stack;

public class BaseballGame {
	
	public static void main(String[] args) {
		calPoints(new String[] {"5","-2","4","C","D","9","+","+"});
	}
	
	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		int sum=0;
		int valid=0;
		for(String s: ops) {
		   if(s.equals("+") && stack.size()>0) {
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
		            
		    }else if(s.equals("D") && stack.size()>0){
		        valid= stack.peek()+stack.peek();
		        sum+=valid;
		        stack.push(valid);
		        
		    }else if(s.equals("C") && stack.size()>0){
		        valid= stack.pop();
		        sum-=valid;
		    }else {
		        valid= Integer.parseInt(s);
		        sum+=valid; 
		        stack.push(Integer.parseInt(s));
		    }  
		}
		return sum;
    }
}
