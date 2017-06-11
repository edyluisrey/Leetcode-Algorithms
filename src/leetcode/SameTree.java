package leetcode;

public class SameTree {

	public static void main(String[] args) {
		SameTree test= new SameTree();
		TreeNode t = new TreeNode(2);
		t.left= new TreeNode(3);
		t.right =  new TreeNode(4);
		TreeNode t2 = new TreeNode(2);
		t2.left= new TreeNode(3);
		t2.right =  new TreeNode(4);
		System.out.println(test.isSameTree(t, t2));

	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null)  return true;
		if(p==null || q==null)  return false;
		if(p.val!=q.val)  return false;
		return  isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}

/*class TreeNode {
	   int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { 
		   val = x; 
	    }
}*/
