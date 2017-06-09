package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class KillProcess {

	public static void main(String[] args) {
		KillProcess test =  new KillProcess();
		List<Integer> pid= new ArrayList<>(Arrays.asList(new Integer[] {1, 3, 10, 5}));
		List<Integer> ppid= new ArrayList<>(Arrays.asList(new Integer[] {3, 0, 5, 3}));
		List<Integer> r= new ArrayList<>();
        r= test.killProcess(pid, ppid, 5);
        System.out.println(r.toString());
	}
	
	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
		List<Integer> r= new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i =0; i< ppid.size();i++){
			map.putIfAbsent(ppid.get(i), new LinkedList<>());
            map.get(ppid.get(i)).add(pid.get(i));
		}
		Queue<Integer> q= new LinkedList<Integer>();
		q.add(kill);
		while(!q.isEmpty()){
		   int v = q.poll();
		   r.add(v);
		   List<Integer> list = map.get(v);  
           if (list != null) q.addAll(list);
		}
		return r;		
    }

}
