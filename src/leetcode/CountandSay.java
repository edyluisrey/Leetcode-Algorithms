package leetcode;

public class CountandSay {

	public static void main(String[] args) {
		CountandSay test = new CountandSay();
		System.out.println(test.countAndSay(5));

	}
	
	public String countAndSay(int n) {
        if(n==0) return "";
        String prev=String.valueOf(1);
        for(int i=1;i<n;i++){
            char[] charPrev= prev.toCharArray();  
            char prevChar= charPrev[0];  
            int cont=1;
            StringBuilder str= new StringBuilder();
            for(int j=1; j< charPrev.length; j++){
                if(charPrev[j]==prevChar){
                	cont++;
                } 
                else{
                    str.append(cont+""+ prevChar);
                    cont=1;
                    prevChar=charPrev[j];
                }
            }
            str.append(cont).append(prevChar);
            prev = str.toString();
        }
        return prev;
    }

}
