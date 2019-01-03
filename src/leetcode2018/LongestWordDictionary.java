package leetcode2018;

import java.util.HashMap;
import java.util.Map;

public class LongestWordDictionary {
	public String longestWord(String[] words) {
	    TrieNode root = new TrieNode('0');
	    Result re = new Result("");
	    for(String word: words)
	        insert(word, root);
	    dfs(root, re);     
	    return re.val;    
	}
	
	public void dfs(TrieNode root, Result re){ 
	    if(root.isComplete && re.length < root.word.length()){
	        re.val = root.word;
	        re.length=root.word.length();
	    }
	    if(root.isComplete && root.word.length() == re.length && root.word.compareTo(re.val)<0){
	        re.val = root.word;
	        re.length=root.word.length();
	    }
	    for(char c: root.children.keySet()){
	       if(root.children.get(c).isComplete) 
	         dfs(root.children.get(c), re);       
	    }
	}
	
	public void insert(String word, TrieNode root){
	    TrieNode currentRoot = root;
	    int i =0;
	    for(char c: word.toCharArray()){
	        if(!currentRoot.children.containsKey(c)){
	            TrieNode node = new TrieNode(c);
	            currentRoot.children.putIfAbsent(c, node);
	        }
	        
	        currentRoot = currentRoot.children.get(c);
	        i++;
	        if(word.length()==i){
	           currentRoot.isComplete = true;
	           currentRoot.word = word; 
	        }
	        
	    }
	}
	
	class Result{
	   String val;
	   int length; 
	   Result(String val){
	      this.val= val; 
	      this.length=0; 
	   } 
	}
	
	class TrieNode {
	    Character val;
	    Map<Character, TrieNode> children;
	    String word;
	    boolean isComplete;
	    TrieNode(Character val){
	        this.val = val;
	        this.children = new HashMap<>();
	        this.word = "";
	        this.isComplete = false;
	    }
	}
}
