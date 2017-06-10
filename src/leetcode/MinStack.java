package leetcode;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> stack = new Stack<>();
	private int min= Integer.MAX_VALUE;
	
	public static void main(String[] args){
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getMin()); //-3
		obj.pop();
		System.out.println(obj.top()); //0
		System.out.println(obj.getMin()); //-2
	}
	
	/** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(x<=min){
        	stack.push(min);
        	min =x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(min==stack.peek()){
        	stack.pop();
        	min= stack.pop();
        }else
        	stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
