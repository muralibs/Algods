/*
 * http://algorithms.tutorialhorizon.com/print-all-the-permutations-of-a-string/
 */
package strings;
import java.util.Arrays;

public class PrintAllPermutations {
    
    public void permute(char[] arr, int left, int size) {
        if(left == size) {
            System.out.println(Arrays.toString(arr));
        } else {
            for(int x = left; x < size; x++) {
                swap(arr, left, x);
                permute(arr, left+1, size);
                swap(arr, x, left);
                
            }
        }       
    }
    
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}

