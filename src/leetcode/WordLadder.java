package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("hot"); list.add("dot"); list.add("dog");
			list.add("lot"); list.add("log"); list.add("cog"); 
			String[] values = { "a","b","c"};
			WordLadder w = new WordLadder();
			System.out.println(w.ladderLength("hit", "cog", list));
			System.out.println(w.ladderLength("a", "c", Arrays.asList(values)));
		
	}
	
	public  int ladderLength(String beginWord, String endWord, List<String> wordList) {
		    Queue<String> q= new LinkedList<String>();
		    List<String> visited = new ArrayList<>(); 
		    q.add(beginWord);
		    int len =0;
		    while(!q.isEmpty()){
		    	String v= q.poll();        	        	
		    	if (isAdjacent(v, endWord) && wordList.contains(endWord)) {
		            return len+1; 
		        }
		    	else{ 
		        	for(String word: wordList){
		        		if(isAdjacent(v, word) && !visited.contains(word)){
		        			q.add(word);
		        			visited.add(word);  
		        		}
		        	}
		        	len++;
		    	} 	
		    	
		    }
		    return 0;
	}
	
	public boolean isAdjacent(String w, String w2){
			int cont =0;
			for(int i= 0; i< w.length(); i++ ){
				if(w.charAt(i)!=w2.charAt(i))
					cont++;
			}
			if(cont==1)
				return true;
			else
				return false;
	}  	 

}
