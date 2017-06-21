package leetcode;

public class SubtreeAnotherTree {

	public static void main(String[] args) {
		SubtreeAnotherTree test = new SubtreeAnotherTree();
		TreeNode s= new TreeNode(3);
		s.left= new TreeNode(4);
		s.right= new TreeNode(5);
		s.left.left = new TreeNode(1);
		s.left.right= new TreeNode(2);
		TreeNode t= new TreeNode(4);
		t.left= new TreeNode(1);
		t.right= new TreeNode(2);
		System.out.println(test.isSubtree(s, t));

	}
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
		   if(s==null)  return false;
		   if(t==null)  return true;
		   return sameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
	}
	public boolean sameTree(TreeNode s, TreeNode t){
			if(s==null && t==null)  return true;
			if(s==null || t==null)  return s==t;
			if(s.val!=t.val)  return false;
			return  sameTree(s.left, t.left) && sameTree(s.right, t.right);
	}
    
	
}

/*class TreeNode{
 *   int val;
 *   TreeNode left;
 *   TreeNode right;
 *   TreeNode(int x){
 *   	val=x;
 *   }
 *   }
 * */
