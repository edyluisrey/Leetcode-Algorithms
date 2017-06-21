package leetcode;

public class BinaryTreeTilt {
    int res=0;
	public static void main(String[] args) {
		BinaryTreeTilt test = new BinaryTreeTilt();
		TreeNode t = new TreeNode(1);
		t.left =  new TreeNode(2);
		t.right = new TreeNode(3);
		t.left.left = new TreeNode(6);
		t.left.right= new TreeNode(4);
		System.out.println(test.findTilt(t));

	}
	
	public int findTilt(TreeNode root) {        
	    sumfindTilt(root); 
	    return res;       
	}
	public int sumfindTilt(TreeNode root){
		if(root==null) return 0;
		int l= sumfindTilt(root.left);
		int r= sumfindTilt(root.right);  
		res= res + Math.abs(l-r);  
		return l+r+root.val;
	}
	

}
