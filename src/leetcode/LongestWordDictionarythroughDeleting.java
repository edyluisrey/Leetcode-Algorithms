package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestWordDictionarythroughDeleting {

	public static void main(String[] args) {
		LongestWordDictionarythroughDeleting test = new  LongestWordDictionarythroughDeleting();
		List<String> list = new ArrayList<>(Arrays.asList(new String[]{"ale","apple","monkey","plea"}));
		System.out.println(test.findLongestWord("abpcplea",list));
	}
    
	public String findLongestWord(String s, List<String> d) {
		Collections.sort(d, (a,b)->(a.length()==b.length())? a.compareTo(b): b.length()-a.length());
		for(String str: d){
			int cont =0;
			for(char c: s.toCharArray()){
				if(cont < str.length() && str.charAt(cont)==c){
					cont++;
				}		
			}
			if(str.length()==cont) return str;
		}
		return "";
    }

}
