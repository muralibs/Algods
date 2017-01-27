/*
 * http://algorithms.tutorialhorizon.com/print-all-diagonals-of-a-given-matrix/
 */
public class PrintAllDiagonalMatrix {

    public void print(int[][] a) {
        int row = 0;
        int col = 0;
        
        /*while(row < a.length) {
            col = 0;
            int rowTemp = row;
            while(rowTemp > 0) {
                System.out.print(a[rowTemp][col] + " ");
                rowTemp--;
                col++;
            }
            System.out.println("");
            row++;
        }*/
        
        //print second half
        
       /* while(col < a.length) {
            int colTemp = col;
            row = a.length -1;
            while(colTemp <=a.length-1) {
                System.out.print(a[row][colTemp] + " ");
                colTemp++;
                row--;
            }
        } */
        
    }

}


