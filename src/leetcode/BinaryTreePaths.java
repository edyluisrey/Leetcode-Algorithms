package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePaths {
	
 public List<String> binaryTreePaths(TreeNode root) {
	   List<String> list = new ArrayList<String>();
	   Stack<TreeNode> stack1 = new Stack<>();
	   Stack<String> stack2 = new Stack<>();
	   if(root==null) return list;
	   stack1.push(root);
	   stack2.push("");
	   while(!stack1.isEmpty()){
	       TreeNode curr= stack1.pop();
	       String currStr= stack2.pop();
	       if(curr.left==null && curr.right==null) list.add(currStr+curr.val);
	       if(curr.left!=null){
	           stack1.push(curr.left);
	           stack2.push(currStr+ curr.val+"->");               
	       }
	       if(curr.right!=null){
	           stack1.push(curr.right);
	           stack2.push(currStr+ curr.val+ "->");
	       }
	   }
	   return list; 
    }
}
