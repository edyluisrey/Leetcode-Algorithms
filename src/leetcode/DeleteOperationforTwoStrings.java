package leetcode;

public class DeleteOperationforTwoStrings {

	public static void main(String[] args) {
		DeleteOperationforTwoStrings  test = new DeleteOperationforTwoStrings();
		System.out.println(test.minDistance("park", "spake"));

	}
	
	public int minDistance(String word1, String word2) {
        	if(word1.length()==0 && word2.length()==0) return 0;
        	if(word1.length()==0) return word2.length();
        	if(word2.length()==0) return word1.length();
        	int n = word1.length();
        	int m= word2.length();
        	int[][] matrix = new int[n+1][m+1]; 
        	for(int i=0; i<n+1;i++){
        		matrix[i][0]= 0;
        	}
        	for(int j=0; j< m+1;j++){
        		matrix[0][j]=0;
        	}
        	
        	for(int i=1;i< n+1;i++){
        		for(int j=1; j< m+1; j++){
        			if(word1.charAt(i-1)!= word2.charAt(j-1))  
        				matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
        			else{
        				matrix[i][j]= matrix[i-1][j-1]+1;
        			}
        		}
        	}
        	
            return (n-matrix[n][m])+ (m-matrix[n][m]);
    }

}
