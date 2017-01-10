package leetcode;

public class ZigZagConversion {

	public static void main(String[] args) {
			System.out.println(convert("PAYPALISHIRING", 3));
			System.out.println(convert("ABC", 2));
			System.out.println(convert("ABCDEF", 4));
	}
	
	public static String convert(String s, int numRows) {
		   if(numRows<=1 || numRows>=s.length()) return s;		   
		   StringBuilder[] sb = new StringBuilder[numRows];
		   for (int i = 0; i < numRows; i++) {
		       sb[i] = new StringBuilder();
		   }
		   
		   int mod = numRows*2-2;
		   int index=0;
		   for (int i = 0; i < s.length(); i++) {  
			   index= i%mod>=numRows?mod - i % mod:i % mod;
			   sb[index].append(s.charAt(i));				   				 	       
		   }
		   
		   String result = "";
		   for (StringBuilder str : sb) {
		       result += str.toString();
		   }
		   return result;   
	}

}
