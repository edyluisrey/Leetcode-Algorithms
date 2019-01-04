package leetcode2018;

import java.util.HashMap;
import java.util.Map;

public class ImplementPrefixTree {
	private TrieNode root;
	/** Initialize your data structure here. */
	public ImplementPrefixTree() {
	       root = new TrieNode('0');
	}
	
	/** Inserts a word into the trie. */
	public void insert(String word) {
	    TrieNode currentRoot = root;
	    int i = 0;
	    for(char c: word.toCharArray()){
	        if(!currentRoot.children.containsKey(c)){
	            TrieNode node = new TrieNode(c);
	            currentRoot.children.put(c, node);
	        }
	        
	        currentRoot = currentRoot.children.get(c);
	        i++;
	        currentRoot.word = word.substring(0,i);
	        if(word.length()==i){
	           currentRoot.isComplete = true;
	        }
	        
	    }
	}
	
	/** Returns if the word is in the trie. */
	public boolean search( String word) {
	    TrieNode node = searchHelper(word);
	    if(node==null) return false;
	    return node.isComplete;
	}
	
	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
	    return searchHelper(prefix)!=null;
	}
	
	public TrieNode searchHelper(String word){
	    TrieNode node = root;
	    for(char c: word.toCharArray()){
	        if(node.children.containsKey(c)){
	            node = node.children.get(c); 
	        }else {
	            return null;
	        }
	    }
	    return node;
	}
	
	
	class TrieNode{
	    char val;
	    Map<Character, TrieNode> children;
	    String word;
	    boolean isComplete;
	    TrieNode(char val){
	       this.val=val; 
	       this.children = new HashMap<>();
	       this.word= "";
	       this.isComplete = false; 
	    }
    }
}
