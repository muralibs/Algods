/*
 * GeeksforGeeks
 * http://www.geeksforgeeks.org/find-if-array-can-be-divided-into-two-subarrays-of-equal-sum/
 * 
 */
public class EqualSumSubArrays {
    
    
    public boolean divideArrays(int[] arr) {
        
        int len = arr.length;
        int totalSum =0;
        //calculate the arr sum
        for(int i =0; i< len; i++) { totalSum += arr[i];}
        
        int sumSoFar = 0;
        
        for(int i = 0; i < len ; i++) {
            
            //if by removing arr[i], we get the total sum
            
            if(2 * sumSoFar + arr[i] == totalSum) {
                System.out.println("The array has been divided.");
                printSubArray(arr, 0, i -1 );
                printSubArray(arr, i+1 , len-1);
                
                return true;
            }
            sumSoFar += arr[i];
            
        }
        
        return false;
    }
    
    private void printSubArray(int[] arr, int low , int high) {
        System.out.println("[ ");
        for(int i = low; i <= high; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" ]");
    }
    
}
