package leetcode2018;

import java.util.Collections;
import java.util.PriorityQueue;

public class RelativeRanks {
	
	public String[] findRelativeRanks(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(10, Collections.reverseOrder());
        for(int i : nums){
            q.offer(i);
        }
        
        int i=0;
        String[] s = new String[nums.length];
        Integer val=null;
        while( (val = q.poll()) != null) {
            if(i==0)
                s[i]="Gold Medal";
            if(i==1)
                s[i]="Silver Medal";
            if(i==2)
                s[i]="Bronze Medal";
            else
                s[i]=val+"";
            i++;
            
        }
        return s;
    }
}
