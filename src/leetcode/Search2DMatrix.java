package leetcode;

public class Search2DMatrix {

	public static void main(String[] args) {
		Search2DMatrix  test = new  Search2DMatrix();
		int[][] ma = new int[][] {{1,3,5,7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
		int[][] ma2 = new int[][] {{1,1}};
		//System.out.println(test.searchMatrix(ma, 3));
		System.out.println(test.searchMatrix(ma2, 2));

	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null || matrix.length==0) return false;
		int n = matrix.length;
		int m = matrix[0].length;
		int l=0; int p= n*m-1;
		while(l<=p){
			int mid = (l+p)/2;  
			int value = matrix[mid/m][mid%m];  
			if(value==target) return true;
			if(target<value)
				p= mid-1;
			else
			    l= mid+1;
				
		}
		return false;
    }

}
