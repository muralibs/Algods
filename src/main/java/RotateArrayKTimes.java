/*
 * http://www.dsalgo.com/2013/02/rotate-array-k-times-to-left.html
 */
public class RotateArrayKTimes {
    
    public void rotate(int[] arr, int k) {
        int len = arr.length;
        printArray(arr);
        System.out.println("Initial Print");

        reverse(arr, 0, len-1);
        System.out.println("\nAfter full reverse");
        printArray(arr);
        reverse (arr, 0, len - k-1);
        System.out.println("\nAfter half reverse");
        printArray(arr);
        reverse(arr, len-k, len-1);
        System.out.println("\n----Rotated array--------------");
        printArray(arr);
        
    }
    
    private void printArray(int[] arr) {
        for(int i =0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    
    private void reverse(int[] arr, int i , int j) {
        
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++; 
            j--;
            
            
        }
        
    }
}
