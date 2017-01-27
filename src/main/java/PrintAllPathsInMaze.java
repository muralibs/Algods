/*
 * http://algorithms.tutorialhorizon.com/print-all-paths-from-top-left-to-bottom-right-in-two-dimensional-array/
 * 
 */
public class PrintAllPathsInMaze {
    
    private int rowCount;
    private int colCount;
    private int[][] a;
    
    
    public PrintAllPathsInMaze(int[][] a) {
        this.rowCount =  a.length;
        this.colCount = a[0].length;
        this.a = a;
    }
    
    
    public void printAll(int currentRow, int currentColumn, String path) {
        
        if(currentRow == rowCount - 1) {
            for(int i = currentColumn; i< colCount; i++) {
                path += "-" + a[currentRow][i]; 
            }
            System.out.println(path);
            return;
        }
        
        if(currentColumn == colCount -1) {
            for(int i = currentRow; i < rowCount; i++) {
                path += "-" + a[i][currentColumn];
            }
            System.out.println(path);
            return;
        }
        
        path += "-" + a[currentRow][currentColumn];
        
        printAll(currentRow+1, currentColumn, path);
        printAll(currentRow, currentColumn+1, path);
        
        
    }
    
}
