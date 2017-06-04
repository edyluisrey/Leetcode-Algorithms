package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1= new ListNode(2);
		ListNode l2= new ListNode(5);
		AddTwoNumbers addTwoNumbers= new AddTwoNumbers();
		ListNode l3= addTwoNumbers.addTwoNumbers(l1, l2);
		while (l3 != null) {
		      System.out.format("%d", l3.val);
		      l3 = l3.next;
		}
	}
    
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry =0;		 
		ListNode newList = new ListNode(0);
		ListNode Newhead = newList;
		while(l1 != null || l2 != null){
			if(l1 != null){
			    carry += l1.val;
			    l1 = l1.next;
			}
			if(l2 != null){
			    carry += l2.val;
			    l2 = l2.next;
			}
			Newhead.next = new ListNode(carry%10);
			Newhead = Newhead.next;
			carry /= 10;
		}	
		if(carry==1) 
			Newhead.next=new ListNode(1); 
		return newList.next;
    }
}

/*class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int x) {
	    val = x;
	    next = null;
	  }
}*/
