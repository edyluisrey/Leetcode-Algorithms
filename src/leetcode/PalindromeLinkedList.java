package leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
	
	public static void main(String[] args){
	   ListNode r = new ListNode(2);
	   r.next= new ListNode(1);
	   r.next.next = new ListNode(2);
	   PalindromeLinkedList test = new PalindromeLinkedList();
	   System.out.println(test.isPalindrome(r));
	}
	
	public boolean isPalindrome(ListNode head) {
	    if(head == null) return true;
	    ListNode node = head;
	    Stack<Integer> s = new Stack<>();
	    while(node!=null){
	    	s.push(node.val);
	    	node = node.next; 
	    }
	    while(head!=null){
	    	if(head.val!= s.pop())
	    		return false;
	    	head = head.next;
	    }
	    return true;
	}
}
