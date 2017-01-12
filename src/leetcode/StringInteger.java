package leetcode;

public class StringInteger {

	public static void main(String[] args) {
		   System.out.println(myAtoi("-0012a42"));		
		   System.out.println(myAtoi("+-2"));	
		   System.out.println(myAtoi("a3"));
		   System.out.println(myAtoi("9223372036854775809"));
		   System.out.println(myAtoi("922337"));

	}
	
	public static int myAtoi(String str) {
		double num=0;
		str= str.trim();
		if(str.length()<1)
			return 0;		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
				num= num*10+(Integer.parseInt(Character.toString(str.charAt(i))));
			else if(!(i==0 && (str.charAt(i)=='-' || str.charAt(i)=='+')))
				break;
		} 
		if(str.charAt(0)=='-')
			num=num*(-1);
		else
			num=num*(+1);
		if(num>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(num<Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int)num;
	}

}