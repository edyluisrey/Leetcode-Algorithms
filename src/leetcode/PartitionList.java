package leetcode;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode list1= new ListNode(0);
		ListNode list2= new ListNode(0);
		ListNode temp1= list1;
		ListNode temp2 = list2;
		while(head!=null){
		    if(head.val<x){
		        temp1.next= head;
		        temp1= temp1.next;
		    }else{
		        temp2.next = head;
		        temp2 = temp2.next;
		    }
		    head = head.next;
		}
		temp2.next=null;
		temp1.next= list2.next;
		return list1.next;
	}
}
