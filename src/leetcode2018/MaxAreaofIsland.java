package leetcode2018;

public class MaxAreaofIsland {
	private int re=0; 
	public int maxAreaOfIsland(int[][] grid) {
	    int n = grid.length;
	    int m = grid[0].length;
	    int max =0;
	    boolean[][] visited = new boolean[n][m];
	    for(int i = 0; i< n; i++){
	        for(int j=0; j<m; j++){
	            if(grid[i][j]==1 && !visited[i][j]){
	                re=0;
	                bfs(grid, i, j, visited);
	                max= Math.max(max,re);
	            }
	                
	        }
	    }
	    return max;
	}
	
	public void bfs(int[][] grid, int i, int j, boolean[][] visited){
	    if(i<0 || i>=grid.length || j<0 || j >= grid[0].length)
	        return; 
	    if(grid[i][j]==0 || visited[i][j]) return;
	    
	    visited[i][j] = true;
	    re++;
	    
	    bfs(grid, i-1, j, visited);
	    bfs(grid, i, j+1, visited);
	    bfs(grid, i+1, j, visited );
	    bfs(grid, i, j-1, visited);       
	}
}
