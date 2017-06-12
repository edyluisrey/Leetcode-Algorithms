package leetcode;

import java.util.Stack;

public class ImplementQueueusingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		//System.out.println(obj.pop());
		System.out.println(obj.peek());
		System.out.println(obj.empty());
	}

}
class MyQueue {
		Stack<Integer> stack; 
		Stack<Integer> stack1; 
		/** Initialize your data structure here. */
		public MyQueue() {
			stack = new Stack<>();
			stack1= new Stack<Integer>();
		}
		
		/** Push element x to the back of queue. */
		public void push(int x) {    	
				stack.push(x);    		
		}
		
		/** Removes the element from in front of queue and returns that element. */
		public int pop() {
			if(stack1.isEmpty()){
		        while(!stack.isEmpty()){
		        	stack1.push(stack.pop());
		        }
			}   
		    return stack1.pop();
		}
		
		/** Get the front element. */
		public int peek() {
			if(stack1.isEmpty()){
		    	 while(!stack.isEmpty()){
		         	stack1.push(stack.pop());
		         }	    	
			} 
			return stack1.peek();
		}
		
		/** Returns whether the queue is empty. */
		public boolean empty() {
		    return stack.isEmpty() && stack1.isEmpty();
		}
}
