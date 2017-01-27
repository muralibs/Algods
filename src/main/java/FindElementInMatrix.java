/*
 * Cracking the coding interview
 */
public class FindElementInMatrix {
    
    /*
     * Finds the element in an M X N matrix
     */
    public boolean find(int[][] mat, int element) {
        int m = mat.length;
        int n = mat[0].length;
        
        int row =0;
        int col = n -1;
        
        while (row < m && col > 0) {
            if(mat[row][col]==element) {
                
                System.out.println("Element is found at row : " + row + " and column : " + col);
                return true;
            } else if (mat[row][col]> element) {
                col--;
            } else {
                row++;
            }
        }
        
        return false;
    }
}
