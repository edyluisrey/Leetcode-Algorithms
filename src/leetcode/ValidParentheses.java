package leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{()"));
	}
	
	public static boolean isValid(String s) {
	    Stack<Character> st = new Stack<>();
	    for(char c: s.toCharArray()){ 
	       if(c=='(' || c=='[' || c=='{'){
	    	   st.push(c);
	       }else{
	    	   if(st.isEmpty())
	    		   return false;
	    	    char prev= st.peek(); 
	    	    if(c==')' && prev=='('){
		    		st.pop();
		    	}else if(c==']' && prev=='['){
		    		st.pop();
		    	}else if(c=='}' && prev=='{'){
		    		st.pop();
		    	} else{
		    		return false;
		    	}
	       }
	    }
	    return st.isEmpty();
	}

}
