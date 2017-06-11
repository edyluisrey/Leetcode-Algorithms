package leetcode;


public class MaximumDepthBinaryTree {
	public static void main(String[] args){
		TreeNode t = new TreeNode(3);
		t.left=  new TreeNode(9);
		t.left.right = new TreeNode(10);
		t.right= new TreeNode(20);
		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(7);
		t.right.right.left = new TreeNode(2);
		MaximumDepthBinaryTree test = new MaximumDepthBinaryTree();
		System.out.println(test.maxDepth(t));
	}
	
	public int maxDepth(TreeNode root) {
	    if(root == null)  return 0;	
	    int l = 1, r=1;  
	    if(root.left!=null)
	    	l =  maxDepth(root.left)+1;
	    if(root.right!=null)
	    	r= maxDepth(root.right)+1;
		return Math.max(l,r);
	}
}
/*
  class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x){
       val= x;
      }
  }
 */
