package leetcode;

public class LinkedListCycle {
	
	public static void main(String[] agrs){
		ListNode r= new ListNode(3);
		r.next = new ListNode(2);
		r.next.next= new ListNode(0);
		r.next.next.next= new ListNode(-4);
		LinkedListCycle test = new LinkedListCycle();
		System.out.println(test.hasCycle(r));
	}

	public boolean hasCycle(ListNode head) {
		if(head==null || head.next==null) return false;
		ListNode l= head.next;
		while(l!=null){
			if(l==head)
				return true;
			l= l.next;
		}
		return false;
	}
}
