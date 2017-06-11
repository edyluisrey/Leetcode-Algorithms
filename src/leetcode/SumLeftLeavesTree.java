package leetcode;

public class SumLeftLeavesTree {
	
		public static void main(String[] args){
			TreeNode t = new TreeNode(3);
			t.left=  new TreeNode(9);
			t.left.right = new TreeNode(10);
			t.right= new TreeNode(20);
			t.right.left = new TreeNode(15);
			t.right.right = new TreeNode(7);
			t.right.right.left = new TreeNode(2);
			SumLeftLeavesTree test=  new SumLeftLeavesTree();
			System.out.println(test.sumOfLeftLeaves(t));
		}
		
		public int sumOfLeftLeaves(TreeNode root) {
	        int r = 0;
	        if(root!=null){
	            if(root.left != null){
	            	if(root.left.left == null && root.left.right==null)
	            		r=r+root.left.val;
	            	else
	            		r+= sumOfLeftLeaves(root.left);
	            } 
	            if(root.right!=null)
	            	r=r+sumOfLeftLeaves(root.right);
	        }
            return r;
	    }
	
}
