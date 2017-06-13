package leetcode;

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		SimplifyPath  test = new SimplifyPath();
		System.out.println(test.simplifyPath("/a/./b/../../c/"));
	}
	
	public String simplifyPath(String path) {
        String[] p = path.split("/");
        Stack<String> s = new Stack<>();
        for(String str: p){
            if(!str.equals(".") && !str.isEmpty()){
              if(str.equals("..")){
                  if(!s.isEmpty())
                     s.pop();
              }else 
                  s.push(str);
            }
        }
        if(s.isEmpty())
           return "/";
        StringBuilder res= new StringBuilder();
        for(String st : s) 
            res.append("/"+st);
        
        return res.toString();
    }


}
