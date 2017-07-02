package leetcode;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        int  re=0;
        int i= s.length()-1;
        int p=0;
        while(i>=0){
            re+= (s.charAt(i)-64)* Math.pow(26,p);
            i--;
            p++;
        }
        return re;
    }
}
