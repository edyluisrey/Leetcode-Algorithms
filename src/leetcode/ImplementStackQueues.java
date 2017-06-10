package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackQueues {
	public static void main(String[] args){
		MyStack stack=  new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.top());
	}
}

class MyStack {
		Queue<Integer> q = new LinkedList();
		/** Initialize your data structure here. */
		public MyStack() {
		    
		}
		
		/** Push element x onto stack. */
		public void push(int x) {
		    q.offer(x);
		    int n = q.size()-1;
		    for(int i=0;i< n;i++){
		    	q.offer(q.poll());
		    }
		}
		
		/** Removes the element on top of the stack and returns that element. */
		public int pop() {
		    return q.poll();
		}
		
		/** Get the top element. */
		public int top() {
		    return q.peek();
		}
		
		/** Returns whether the stack is empty. */
		public boolean empty() {
		    return q.isEmpty(); 
		}
}
