package leetcode;

public class ReorderList {
	public void reorderList(ListNode head) {
		    if (head == null || head.next == null) {
		        return;
		    }
		    ListNode slow = head;
		    ListNode fast= head;
		    while(fast!=null && fast.next!=null){
		        fast= fast.next.next;
		        slow= slow.next;
		    }
		    
		    ListNode second = slow.next;
			slow.next = null;
		    
		    fast= head;
		    second= reverse(second);
		          
		    while (second != null) {
				ListNode temp1 = fast.next;
				ListNode temp2 = second.next;
		        fast.next =second;
		        second.next = temp1;           
		        fast= temp1;
		        second= temp2;
		  }
	    
	}
	
	public ListNode reverse(ListNode head){
		ListNode prev=null;
		while(head!=null){
		    ListNode temp = head.next;
		    head.next= prev;
		    prev= head;
		    head= temp;            
		}
		return prev;
	}
}
