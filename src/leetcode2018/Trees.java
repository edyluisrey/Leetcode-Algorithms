package leetcode2018;

import java.util.ArrayList;
import java.util.List;

public class Trees {

	public static void main(String[] args){
		Trees  test = new Trees();
		TreeNode t = new TreeNode(5);
		t.left = new TreeNode(3);
		t.left.left = new TreeNode(2);
		t.left.right = new TreeNode(4);
		t.right = new TreeNode(7);
		//t.right.left = new TreeNode(6);
		//t.right.right= new TreeNode(8);
		test.inOrderTraversal(t); 
		System.out.println();
		test.preOrderTraversal(t);
		System.out.println();
		test.postOrderTraversal(t);
		//System.out.println(test.minDepth(t));
		//test.binaryTreePaths(t);
		//test.lowestCommonAncestor(t, t.left.left, t.left.right);
	}
	
	public int minDepth(TreeNode root) {
	        if(root==null)  return 0;
	        int l = minDepth(root.left);
	        int r = minDepth(root.right);  
	        System.out.println("l"+l+ " :"+r);
	        if(r==0)  return l+1;
	        if(l==0) return r+1;  System.out.println("AAl"+l+ " :"+r);
	        int re=  Math.min(l, r)+1; System.out.println(re);
	        return re;
	        
	}
	
	 public int maxDepth(TreeNode root) {
	        if(root == null)  return 0;	
	        int l = maxDepth(root.left)+1;
	        int r= maxDepth(root.right)+1;
			return Math.max(l,r);
	    }
	 
	public void inOrderTraversal(TreeNode t){
		if(t!=null){
			inOrderTraversal(t.left);
			System.out.print(t.val);
			inOrderTraversal(t.right);
		}
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
	       List<String> list = new ArrayList<>();
	       if(root==null) return list;
	       dfs(root,list, "");
	       return list;
	}
	public void dfs(TreeNode root, List<String> list, String path){
		if(root.left==null && root.right == null){
			list.add(path+ root.val);
			return; 
		}
		path = path+ root.val +"->";
		if(root.left!=null) dfs(root.left, list, path);
		if(root.right!=null) dfs(root.right, list, path);
	}
	
	public void preOrderTraversal(TreeNode t){
		if(t!=null){
			System.out.print(t.val);
			preOrderTraversal(t.left);
			preOrderTraversal(t.right);
		}
	}
	
	public void postOrderTraversal(TreeNode t){
		if(t!=null){
			postOrderTraversal(t.left);
			postOrderTraversal(t.right);
			System.out.print(t.val);
		}
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null || root==p || q== root) return root; System.out.println(root.val);
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if(left!= null && right!=null) { 
			System.out.println("mid:"+root.val); 
			return root;
		};
		System.out.println("left" +left+ " right:"+right);
		TreeNode re = left!=null? left: right;       
		return re;
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){ 
		val=x;
	}
}
