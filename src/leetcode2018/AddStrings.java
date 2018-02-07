package leetcode2018;

public class AddStrings {
	
	public String addStrings(String num1, String num2) {
		int rest=0;
		int n1= num1.length()-1;
		int n2= num2.length()-1; 
		StringBuilder str= new StringBuilder();
		while (n1>=0 && n2>=0) {
		    int a = num1.charAt(n1)-'0';
		    int b = num2.charAt(n2)-'0';
		    int c = a+b+rest;
		    rest=0;
		    if(c>9){
		        rest = c/10;
		        str.append(c%10);
		    }else{
		        str.append(c);
		    }
		    n1--;
		    n2--;
		}
		
		while(n1>=0){
		    int a = num1.charAt(n1)-'0';
		    int c = a+rest;
		    rest=0;
		    if(c>9){
		        rest = c/10;
		        str.append(c%10);
		    }else{
		        str.append(c);
		    }
		    n1--;
		}
		
		while(n2>=0){
		    int a = num2.charAt(n2)-'0';
		    int c = a+rest;
		    rest=0;
		    if(c>9){
		        rest = c/10;
		        str.append(c%10);
		    }else{
		        str.append(c);
		    }
		    n2--;
		}
		
		if(rest>0)
		    str.append(rest);
		return str.reverse().toString();
    }
}
