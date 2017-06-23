package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedList {
	
	public static void main(String[] args){
		RemoveDuplicatesfromSortedList test = new RemoveDuplicatesfromSortedList();
		ListNode l= new ListNode(1);
		l.next= new ListNode(1);
		l.next.next =new ListNode(2);
		ListNode r= test.deleteDuplicates(l);
		System.out.println(r.val +"->"+ r.next.val);
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null) return null;
		ListNode r= new ListNode(0);
		ListNode t= r;
		Set<Integer> set = new HashSet<>();  
		while(head!=null){  
			if(!set.contains(head.val)){
				t.next= new ListNode(head.val); 
				t= t.next;
				set.add(head.val);
			}
			head= head.next;
		}
		return r.next;
    }
}

/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
}*/
