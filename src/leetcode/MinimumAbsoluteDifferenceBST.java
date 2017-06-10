package leetcode;

public class MinimumAbsoluteDifferenceBST {
	private int prev=-1;
	private int min = Integer.MAX_VALUE;
	public static void main(String[] args){
		TreeNode1  t = new TreeNode1(1);
		t.right = new TreeNode1(3);
		t.right.left = new TreeNode1(2);
		MinimumAbsoluteDifferenceBST test = new MinimumAbsoluteDifferenceBST();
		System.out.println(test.getMinimumDifference(t));
	}
	
	public int getMinimumDifference(TreeNode1 root) {       
        if(root==null)  return min;   
        getMinimumDifference(root.left);
        if(prev!=-1)
        	min = Math.min(min, Math.abs(root.val-prev));
    	prev=root.val;        
        getMinimumDifference(root.right);
        return min;
    }
}

class TreeNode1{
	int val;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1(int x){
		val = x;
	}
}
