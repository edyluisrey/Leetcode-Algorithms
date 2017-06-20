package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneGraph {

	public static void main(String[] args) {
		CloneGraph test = new CloneGraph();
		UndirectedGraphNode g0= new UndirectedGraphNode(0);
		UndirectedGraphNode g1= new UndirectedGraphNode(1);
		UndirectedGraphNode g2= new UndirectedGraphNode(2);
		g0.neighbors.add(g1);
		g0.neighbors.add(g2);
		g1.neighbors.add(g2);
		g2.neighbors.add(g2);
		UndirectedGraphNode clone = test.cloneGraph(g0);

	}
	
	 public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
			if(node==null) return null;
			HashMap<UndirectedGraphNode, UndirectedGraphNode> mapVisited = new HashMap<>();
			Queue<UndirectedGraphNode> q= new LinkedList<>();
			UndirectedGraphNode clone= new UndirectedGraphNode(node.label);
			mapVisited.put(node,clone);
			q.offer(node);
			while(!q.isEmpty()){
				UndirectedGraphNode x = q.poll();
				for(UndirectedGraphNode nb : x.neighbors){
					if(!mapVisited.containsKey(nb)){
						mapVisited.put(nb, new UndirectedGraphNode(nb.label));  
						q.offer(nb);	        				        			
					}
					mapVisited.get(x).neighbors.add(mapVisited.get(nb));
				}
			}
			return clone;
	 }

}

class UndirectedGraphNode{
	int label;
	List<UndirectedGraphNode> neighbors;
	UndirectedGraphNode(int x){
		label= x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}