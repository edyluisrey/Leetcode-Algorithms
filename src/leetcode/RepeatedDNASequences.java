package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> findRepeatedDnaSequences(String s) {
	    List<String> list = new ArrayList<>();
	    if(s.length() < 10) return list;
	    Map<String, Integer> map = new HashMap<>();
	    for(int i=0; i< s.length()-9;i++){
	    	String sub= s.substring(i,i+10);  
	        if(map.containsKey(sub)){
	            map.put(sub, map.get(sub)+1);
	        }else{
	            map.put(sub, 1);
	        }
	    }
	    
	    for( String key: map.keySet()){
	        if(map.get(key)>1)
	            list.add(key);
	    }
	    return list;
	    
	}

}
