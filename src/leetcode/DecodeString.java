package leetcode;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		DecodeString test = new DecodeString();
		System.out.println(test.decodeString("3[a2[c]]"));

	}
	
	public String decodeString(String s) {
		  Stack<strNode> stack = new Stack<>(); 
		  stack.push(new strNode(1));
		  int n=0;
		  for(char c: s.toCharArray()){
			  if(Character.isDigit(c)){
				  int v= Integer.parseInt(""+c);
				  n = n*10+v;
			  }
			  if(c=='['){  
				  stack.push(new strNode(n));
				  n=0;
			  }
			  if(Character.isAlphabetic(c)){
				  stack.peek().str.append(c);
			  }
			  if(c==']'){
				  int times= stack.peek().number;
				  String str = stack.pop().str.toString();
				  while(times>0){
					  stack.peek().str.append(str);
					  times--;
				  }
			  }
		  }
		  return stack.pop().str.toString();
	}
    
	class strNode{
		int number;
		StringBuilder str;
		public strNode(int n){
			number= n;
			str = new StringBuilder();
		}
	}
}

