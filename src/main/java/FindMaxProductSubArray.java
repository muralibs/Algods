/*
 * http://www.geeksforgeeks.org/largest-product-subarray-size-k/
 * 
 */
public class FindMaxProductSubArray {
    
    public int find(int[] arr, int k) {
        int n = arr.length;
        //Store the arr sum
        int maxProduct = 1;
        for(int i =0;i <k; i++) { maxProduct *= arr[i]; }
        
        int prevProduct = maxProduct;
        
        for(int i =1; i <= n - k; i++) {
            
            int currentProduct = (prevProduct/arr[i-1]) * arr[i+k-1];
            maxProduct = Math.max(maxProduct, currentProduct);
            prevProduct = currentProduct;
            
        }
        
        return maxProduct;
    }
}
