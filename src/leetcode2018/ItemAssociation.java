package leetcode2018;

import java.util.LinkedList;
import java.util.Queue;

public class ItemAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemAssociation test = new ItemAssociation();
		String[][] mat= new String[][]{ {"Item1","Item2"},
										{"Item3","Item4"},
										{"Item4","Item5"}};
										
		test.largestItemAssociation(mat);

	}
	
	public String[] largestItemAssociation(String[][] itemAssociation)
	{      
		StringBuffer temp= new StringBuffer();
		int n=Integer.MIN_VALUE;
		Queue<String> q = new LinkedList<>();
		for(int i = 0; i< itemAssociation.length; i++){
		     if(!q.isEmpty() && q.peek()!=itemAssociation[i][0]){
		    	 if(n<q.size()){
		    		 n=q.size(); 
			    	 temp.setLength(0);
			         while(!q.isEmpty()){
			             temp.append(q.poll()+",");
		         }
		       }    
		     }
		    for(int j=0;j< itemAssociation[0].length;j++){  	
			    if(!q.contains(itemAssociation[i][j]))
		             q.offer(itemAssociation[i][j]);
		   }
		}
		if(n<q.size()){
		 n=q.size(); 
			 temp.setLength(0);
		     while(!q.isEmpty()){
		         temp.append(q.poll()+",");
		     }
		 } 
		String[] re= temp.toString().split(",");
		return re;
	}

}
