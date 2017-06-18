package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {

	public static void main(String[] args) {
		KeyboardRow test = new KeyboardRow();
		System.out.println(Arrays.toString(test.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));

	}
	
	public String[] findWords(String[] words) {
			Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
			Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
			Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
			List<Set<Character>> listRow = Arrays.asList(row1,row2,row3);
			List<String> list = new ArrayList<>();
			
			for(String str: words){
				String s = str.toLowerCase();
				int numrow=0;
				if(row1.contains(s.charAt(0)))
					  numrow=1;
				else if(row2.contains(s.charAt(0))){
					  numrow=2;
				}if(row3.contains(s.charAt(0))){
					  numrow=3;
				}
				boolean is= true; 
				for(char c: s.toCharArray()){
				    if(!listRow.get(numrow-1).contains(c)){
				    	is = false;
				    	break;
				    } 	
				}
				if(is)
					list.add(str);
			}
			
			String[] result = new String[list.size()];
			for (int i = 0; i < list.size(); i++) {
			    result[i] = list.get(i);
			}
			return result;
	    
	}

}
