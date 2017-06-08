package leetcode;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree test= new SymmetricTree();
		TreeNode t = new TreeNode(2);
		t.left= new TreeNode(4);
		t.right =  new TreeNode(4);
		System.out.println(test.isSymmetric(t));
	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		return isSymmetric(root.left, root.right);
	}
	
	public boolean isSymmetric(TreeNode left, TreeNode right){
		if(left==null && right==null)  return true;
		if(left==null || right==null)  return false;
		if(left.val!= right.val) return false;
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

}
