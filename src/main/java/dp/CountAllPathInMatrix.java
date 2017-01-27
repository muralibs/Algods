package dp;

public class CountAllPathInMatrix {
    
    public int countRecursive(int[][] matrix, int row, int col) {
        
        if(row == matrix.length-1 || col == matrix.length-1) {
            return 1;
        }
        
        return countRecursive(matrix, row+1, col) + countRecursive(matrix, row, col+1);
    }
    
    public int countDP(int[][] matrix ) {
        int[][] result = new int[matrix.length][matrix[0].length];
        
        //fill the results first row with 1
        for(int i =0; i < matrix.length; i++) {
            result[i][0] = 1;
        }
        for(int i =0; i <matrix[0].length; i++) {
            result[0][i] =1;
        }
        
        for(int i =1; i <matrix.length; i++) {
            for(int j =1; j <matrix[0].length; j++) {
                result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        
        return result[matrix.length-1][matrix[0].length-1];

        
        
    }
}