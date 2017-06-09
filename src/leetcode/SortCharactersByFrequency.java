package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		
		SortCharactersByFrequency  test = new SortCharactersByFrequency();
		System.out.println(test.frequencySort("bbcccaA"));
	}
	
	public String frequencySort(String s) {
		   StringBuilder str = new StringBuilder();
		   Map<Character,Integer> map= new HashMap<>(); 
		   for(char c: s.toCharArray()){
			   if(map.containsKey(c)){
				   map.put(c, map.get(c)+1);
			   }else{
				   map.put(c, 1);
			   }  
		   }  
		   List<Map.Entry<Character,Integer>>  list = new ArrayList<>(map.entrySet());
		   Collections.sort(list, (o,o1)->o1.getValue().compareTo(o.getValue()));
		   for(Map.Entry<Character,Integer> entry : list){
			   int i=0;
			   while(i<entry.getValue()){
				   str.append(entry.getKey());
				   i++;
			   }
		   }		   
		   return str.toString();
    }

}
