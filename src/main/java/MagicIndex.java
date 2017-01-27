/*
 * http://algorithms.tutorialhorizon.com/magic-index-find-index-in-sorted-array-such-that-ai-i/
 */
public class MagicIndex {
    
    public int find(int[] a, int low, int high) {
        //using binary search technique
        if(a == null || a.length == 0) {
            return -1;
        }
        
        int mid = (high + low)/ 2;
        
        if(mid == a[mid]) {
            return mid;
        } else if(mid > a[mid]) {
            return find(a, mid+1, high);
        } else {
            return find(a, low, mid-1);
        }
        
        //return -1;
    }
}
