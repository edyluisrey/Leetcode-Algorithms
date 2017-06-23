package leetcode;

public class RotateList {

	public static void main(String[] args) {
		RotateList test = new RotateList();
		ListNode l= new ListNode(1);
		l.next= new ListNode(2);
		l.next.next= new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		
		ListNode r = test.rotateRight(l, 2);
		System.out.println(r.val + "->"+r.next.val+ "->"+r.next.next.val+ "->"+r.next.next.next.val);

	}
	
	public ListNode rotateRight(ListNode head, int k) {
		 if(head ==null) return null;
		 ListNode temp= head;   
		 int n=1;
		 while(temp.next!=null){
			 temp=temp.next;
			 n++;
		 }
		 temp.next =head;  
		 for(int i=1;i<n-k%n;i++){
			 head = head.next;
		 }  
		 temp = head.next;
		 head.next=null;
		 return temp;
	}

}
