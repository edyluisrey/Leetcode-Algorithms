package leetcode;

public class ConstructStringfromBinaryTree {
    int sum =0;
	public static void main(String[] args) {
		ConstructStringfromBinaryTree test = new ConstructStringfromBinaryTree();
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(3);
		t.left.left = new TreeNode(4);
		System.out.println(test.tree2str(t));
	}
		
	public String tree2str(TreeNode t) {
		if(t==null) return "";
		String str = ""+t.val;
		if(t.left ==null && t.right==null)  return str+"Leaf";
		if(t.right==null) return str+"("+tree2str(t.left)+")";
		str= str+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
		return str; 
    }

}

/*
 * class TreeNode{
 *    int val;
 *    TreeNode left;
 *    TreeNode right;
 *    TreeNode(int x){
 *       v=x;
 *    }
 * }
 **/
