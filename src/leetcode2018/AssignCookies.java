package leetcode2018;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		int t = 0;
		for(int i = 0; i< g.length; i++){
		    if(isContent(g[i], s))
		        t++;
		}
		return t;
    }
    
    public boolean isContent(int n, int[] s){
		for(int i = 0; i< s.length; i++){
		    if(s[i]!=-1){
		        if(s[i] >= n){
		            s[i]=-1;
		            return true;
		        }
		    }
		}
		return false;
    }
}
