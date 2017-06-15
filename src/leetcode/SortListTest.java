package leetcode;

public class SortListTest {

	public static void main(String[] args) {
		SortListTest test = new SortListTest();
		ListNode l = new ListNode(4);
	    l.next =  new ListNode(3);
	    l.next.next = new ListNode(1);
	    ListNode re= test.sortList(l);
		System.out.println(re.val);
	}
	
	public ListNode sortList(ListNode head) {
	    if(head ==null || head.next==null)  return head;  
	    ListNode fast = head;
	    ListNode slow = head;
	    ListNode prev= null;
	    while(fast!=null && fast.next!=null){
	    	prev=slow;
	    	fast= fast.next.next;
	    	slow= slow.next;
	    }
	    prev.next=null;
	    ListNode l1 = sortList(head);
	    ListNode l2 = sortList(slow);
	    return merge(l1,l2);
	}
	
	public ListNode merge(ListNode l1, ListNode l2){
		ListNode result = new ListNode(0);
		ListNode l= result;
		while(l1!=null && l2!=null){
			if(l1.val < l2.val){
				l.next = l1;
				l1= l1.next;
			}		
			else{
				l.next = l2;
				l2= l2.next;
			}	
			l= l.next;
		}
		
		if(l1!=null)
			l.next= l1;
		if(l2!=null)
			l.next = l2;
		return result.next;
	}
		
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
}
