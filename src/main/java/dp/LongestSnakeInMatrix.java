/*
 * http://algorithms.tutorialhorizon.com/find-longest-snake-sequence-in-a-given-matrix/
 */
package dp;

public class LongestSnakeInMatrix {
    
    public void maxSequence(int[][] matrix) {
        if(matrix == null) return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLength = 0;
        int maxRow =0;
        int maxCol = 0;
        
        //result array
        int[][] result = new int[rows][cols];
        for(int i =0; i<rows; i++) {
            for(int j =0; j< cols; j++) {
                result[i][j] = 1;
            }
        }
        
        for(int i =0; i<rows; i++) {
            for(int j = 0; j< cols; j++) {
               if(i!=0 || j!=0) { 
                //check from left
                    if(i > 0 && Math.abs(matrix[i][j] - matrix[i-1][j]) == 1) {
                        result[i][j] = Math.max(result[i][j], result[i-1][j] + 1) ;
                        if(maxLength < result[i][j]) {
                            maxLength = result[i][j];
                            maxRow = i;
                            maxCol = j;
                        }
                    }
                    
                    //Check from top
                    if(j > 0 && Math.abs(matrix[i][j] - matrix[i][j-1]) == 1) {
                        result[i][j] = Math.max(result[i][j] , result[i][j-1] + 1) ;
                        
                        if(maxLength< result[i][j]) {
                            maxLength = result[i][j];
                            maxRow = i;
                            maxCol = j;
                        
                        }
                    }
                }
            }
        }
        
        System.out.println("Max length of the sequence: " + maxLength);
        printMaxSequence(matrix, result, maxLength, maxRow, maxCol);
        
    }
    
    private void printMaxSequence(int[][] matrix, int[][] result, int maxLength, int maxRow, int maxCol) {
        
        while(maxLength > 0) {
            System.out.print(" - " + matrix[maxRow][maxCol]);
            if(maxRow>0 && Math.abs(result[maxRow][maxCol] - result[maxRow-1][maxCol]) == 1) {
                maxRow--;
            } else if(maxCol>0 && Math.abs(result[maxRow][maxCol] - result[maxRow][maxCol-1]) == 1) {
                maxCol--;
            }
            maxLength--;
        }
    }
}
