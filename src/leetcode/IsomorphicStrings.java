package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings{
	
	public static void main(String[] args){
		IsomorphicStrings test = new IsomorphicStrings();
		System.out.println(test.isIsomorphic("egg", "add"));
	}
	
	public boolean isIsomorphic(String s, String t){
		if(s==null && t==null )  return false;
		Map<Character, Character> map=  new HashMap<Character, Character>();
		for(int i =0; i< s.length(); i++){
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if(map.containsKey(c1)){
				if(map.get(c1)!= c2)  return false;
			}else{
				if(map.containsValue(c2)) return false;
				map.put(c1, c2);
			}
		}
		return true;
	}
}