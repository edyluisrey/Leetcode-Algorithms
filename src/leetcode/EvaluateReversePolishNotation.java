package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		EvaluateReversePolishNotation  test= new  EvaluateReversePolishNotation();
		System.out.println(test.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
		System.out.println(test.evalRPN(new String[]{"4", "13", "5", "/", "+"}));

	}

	public int evalRPN(String[] tokens) {
		if(tokens.length==0)  return 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i< tokens.length; i++){
			if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")  || tokens[i].equals("/") ){
				int re=0;
				int temp= stack.pop();
				if(tokens[i].equals("+")){
				   re= stack.pop()+ temp;
				}
				if(tokens[i].equals("/")){
				   re= stack.pop()/temp;
				}
				if(tokens[i].equals("*")){
				   re= stack.pop()*temp;
				}
				if(tokens[i].equals("-")){
			 		   re= stack.pop()- temp;
			 	}  
				stack.push(re);
			}else{
				stack.push(Integer.parseInt(tokens[i]));
			}
		}
		
		return stack.peek();
    }

}
