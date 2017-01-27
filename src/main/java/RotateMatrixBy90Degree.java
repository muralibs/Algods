
public class RotateMatrixBy90Degree {
    
    
    public void rotate (int[][] arr ) {
        
        
        // display original matrix
       // displayMatrix(arr);
        int n = arr[0].length;
        
        for(int i = 0; i < n/2 ; i++ ) {
           
           
           for(int j = i ; j < n-i-1; j++) {
               
               int top = arr[i][j];
               int right = arr[j][n-1];
               int bottom = arr[n-1-i][n-1-j];
               int left = arr[n-1-j][i];
               
               //top -> right
               arr[j][n-1] = top;
               
               //right -> bottom
               arr[n-1-i][n-1-j] = right;
               
               //bottom -> left
               arr[n-1-j][i] = bottom;
               
               //left -> top
               arr[i][j] = left;
               
               
           
                System.out.println("top : " + top + ", right : " + right + " , bottom: " + bottom  +" , left: " + left );
            
            }
            
        }
        
        //display after rotating
        System.out.println("--------------------------");
        displayMatrix(arr);
        
    }
    
    public void displayMatrix(int[][] arr) {
        for(int i =0; i< arr.length ; i++ ) {
            
            for(int j =0; j<arr[i].length ; j++) {
                
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
