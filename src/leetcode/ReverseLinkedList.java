package leetcode;

import java.util.Stack;

public class ReverseLinkedList {
	public static void main(String[] args){
		ReverseLinkedList test = new ReverseLinkedList();
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		ListNode r = test.reverseList(l);
		System.out.println(r.val + "->"+r.next.val + "->"+ r.next.next.val);
	}
	
	public ListNode reverseList(ListNode head) {
	     if(head==null)  return null;
	     Stack<Integer> s= new Stack<>();
	     while(head!=null){
	    	 s.push(head.val);
	    	 head= head.next;
	     }
	     ListNode r= new ListNode(-1);
	     ListNode temp= r;
	     while(!s.isEmpty()){
	    	 temp.next= new ListNode(s.pop());
	    	 temp= temp.next;
	     }
	     return r.next;
	}
}

/*class ListNode{
	int v;
	ListNode next;
	ListNode(int x){
		v= x;
	}
}*/