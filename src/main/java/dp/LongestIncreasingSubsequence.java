/*
 * http://algorithms.tutorialhorizon.com/dynamic-programming-longest-increasing-subsequence/
 */
package dp;

public class LongestIncreasingSubsequence {
    
    public void findSubsequence(int[] arr) {
        
        int[] LIS = new int[arr.length];
        
        for(int i = 0 ; i < arr.length; i++) {
            int max = -1;
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    System.out.println(" arr[i] " + arr[i] + " arr[j] " + arr[j] + " max : " + max);
                    if(max == -1 || max < LIS[j] + 1) {
                        max = LIS[j] + 1;
                    }
                }
            }
            
            if(max == -1) {
                max = 1;
            }
        
            LIS[i] = max;
        }
        
        /*for(int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println("\n");
        for(int i: LIS) {
            System.out.print( i + "  " );
        }*/
        
        //find the max in LIS
        int result = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < LIS.length; i++) {
            if(result < LIS[i]) {
                result = LIS[i];
                index = i;
            }
        }
        
        int res = result -1;
        String path = arr[index] + " ";
        
        for(int i = index -1; i >= 0; i--) {
            if(LIS[i] == res) {
                path = arr[i] + " " + path;
                res--;
            }
        }        
        
        
        System.out.println("Longest increasing subsequence : " + result);
        System.out.println("Elements : " + path);
        
    }
    
}
