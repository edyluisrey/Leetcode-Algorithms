package leetcode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
			 if(root==null) return true;
			 int left= heightTree(root.left);
			 int right = heightTree(root.right);
			 int diff= Math.abs(left-right);
			 if(diff>1)  return false;
			 else return isBalanced(root.left) && isBalanced(root.right);
	}
	
	public int heightTree(TreeNode root){
			if(root == null) return -1;
			int l = heightTree(root.left)+1;
			int r = heightTree(root.right)+1;
			
			return Math.max(l, r);
	}
}
