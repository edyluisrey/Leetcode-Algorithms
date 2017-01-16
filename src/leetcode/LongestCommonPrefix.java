package leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"aa","a"}));
		System.out.println(longestCommonPrefix(new String[]{"aabc","aadf","a"}));

	}
	
	public static String longestCommonPrefix(String[] strs){
		if(strs.length==0) return "";
		String longest=strs[0];
		StringBuilder temp;
		for(int i=1;i<strs.length;i++){
			temp = new StringBuilder("");
			for(int j=0;j< longest.length() && j<strs[i].length() ;j++){
				if(longest.charAt(j)==strs[i].charAt(j)){
					temp.append(longest.charAt(j));
				}else
					break;
			}
			if(temp.length()<longest.length())
				longest=temp.toString();
		}
		return longest;					
	}

}
