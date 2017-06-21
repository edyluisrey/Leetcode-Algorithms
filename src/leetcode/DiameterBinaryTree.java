package leetcode;

public class DiameterBinaryTree {
	int max=0;
	public static void main(String[] args){
		DiameterBinaryTree test = new DiameterBinaryTree();
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right= new TreeNode(3);
		t.left.left= new TreeNode(4);
		t.left.right = new TreeNode(5);
		System.out.println(test.diameterOfBinaryTree(t));
	}
	
	public int diameterOfBinaryTree(TreeNode root) {
		  if(root ==null) return 0;
		  sum(root);
		  return max;
	}
	
	public int sum(TreeNode root){
		  if(root ==null) return 0;
		  int l=0,r=0;  
		  if(root.left!=null)
			  l= sum(root.left);
		  if(root.right!=null)
			  r= sum(root.right);
		  max= Math.max(max, l+r);  
		  return Math.max(l,r)+1;
	}
}
