package leetcode;

public class NumMatrix {
	   private int[][] matrix;
	   public NumMatrix(int[][] matrix) {
	        this.matrix = matrix;
	   }
	    
	    public int sumRegion(int row1, int col1, int row2, int col2) {
	        int sum=0;
	        for(int i= row1; i<=row2;i++){
	        	for(int j= col1; j<=col2;j++){
	        		sum = sum+ matrix[i][j];
	        	}	        		
	        }
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	    	int[][] matrix = new int[][]{{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},
	    								{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5} };
	    	NumMatrix  test = new NumMatrix(matrix); 
	    	System.out.println(test.sumRegion(2, 1, 4, 3));
	    	System.out.println(test.sumRegion(1, 1, 2, 2));
	    	System.out.println(test.sumRegion(1, 2, 2, 4));
	    }

}
