package leetcode;

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left= new TreeNode(5);

		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		MergeTwoBinaryTrees test = new MergeTwoBinaryTrees();
		TreeNode t = test.mergeTrees(t1, t2);
		System.out.println(t.val);
		System.out.println(t.left.val);
		System.out.println(t.right.val);
		System.out.println(t.left.right.val);

	}
    
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		   if(t1==null && t2==null)  return null;
		   if(t1==null) return t2;
		   if(t2==null) return t1;
		   TreeNode t= new TreeNode(t1.val+t2.val);
		   t.left = mergeTrees(t1.left, t2.left);
		   t.right = mergeTrees(t1.right, t2.right);
		   return t;
	}
}



//class TreeNode{
//	int val ;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x){
//		val= x;
//	}
//}
