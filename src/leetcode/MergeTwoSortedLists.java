package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
   	 val = x;
   	 next=null;
    }
}

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(2);
		l1.next= new ListNode(4);
		l1.next.next= new ListNode(5);
		ListNode l2 = new ListNode(4);
		ListNode finalNode =  mergeTwoLists(l1,l2);
		while (finalNode != null){
			System.out.println(finalNode.val);
			finalNode = finalNode.next;
		}
	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode newList  = new ListNode(0);
    	ListNode Newhead = newList;
    	while(l1!=null || l2!= null){
    		if(l1==null){
    			Newhead.next= l2; break;
    		}
    		if(l2==null){
    			Newhead.next= l1; break;
    		}
    		if(l1.val < l2.val){
    			Newhead.next = l1;
    			l1= l1.next;
    		}else{
    			Newhead.next=l2;
    			l2= l2.next;
    		}
    		Newhead = Newhead.next;
    	}
    	return newList.next;
    	
    }	

}


