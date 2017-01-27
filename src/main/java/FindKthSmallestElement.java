/** 
 * http://algorithms.tutorialhorizon.com/find-the-kth-smallestlargest-element-in-an-array/
*/

import java.util.*;

public class FindKthSmallestElement {
    
    public int find(int[] arr, int kthElement) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i =0; i < arr.length; i++) {
            q.offer(arr[i]);
        }
        
        //extract the kth element
        int n = -1;
        while (kthElement > 0) {
            n = q.poll();
            kthElement--;
        }
        return n;
    }
}
