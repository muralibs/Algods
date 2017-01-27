/*
 * http://algorithms.tutorialhorizon.com/find-all-the-well-ordered-permutations-of-a-given-string/
 */
package strings;

public class WellFormedPermutations {
    
    public void permute(char[] arr, int left, int size) {
        
        if(left == size && isWellFormed(arr)) {
            System.out.println(java.util.Arrays.toString(arr));
            
        } else {
            for(int x = left; x < size; x++) {
                swap(arr, left, x);
                permute(arr, left +1, size);
                swap(arr, x, left);
            }
        }
        
    }
    
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public boolean isWellFormed(char[] arr) {
        boolean result = true;
        for(int i =0; i< arr.length-1 ; i++) {
            if(Character.toLowerCase(arr[i])> Character.toLowerCase(arr[i+1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
