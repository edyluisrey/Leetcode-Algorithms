package leetcode;

public class PathSum {

	public static void main(String[] args) {
		PathSum test = new PathSum();
		TreeNode t= new TreeNode(10);
		t.left= new TreeNode(5);
		t.right= new TreeNode(-3);
		t.left.left = new TreeNode(3);
		t.left.right= new TreeNode(2);
		t.right.right = new TreeNode(11);
		System.out.println(test.hasPathSum(t, 17));
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null) return false;
		if(root.left==null && root.right==null) return sum == root.val;
		return  hasPathSum(root.left, sum-root.val) || hasPathSum(root.right,sum-root.val);
	}
		

}
