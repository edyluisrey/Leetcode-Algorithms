package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		BinaryTreeInorderTraversal  test = new BinaryTreeInorderTraversal();
		TreeNode t= new TreeNode(1);
		t.right= new TreeNode(2);
		t.right.left= new TreeNode(3);
		System.out.println(test.inorderTraversal(t).toString());
	}
	
	 public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root==null) return list;
		return inorderTraversal(root,list);
	 }
	 
	 public List<Integer> inorderTraversal(TreeNode root, List<Integer> list){
		if(root==null) return list;
		if(root.left!=null)
			inorderTraversal(root.left,list);
		list.add(root.val);  
		if(root.right!=null)
			inorderTraversal(root.right, list);
		return list;
	 }

}

/*class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val= x;
	}
}*/
