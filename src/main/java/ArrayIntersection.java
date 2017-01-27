import java.util.HashSet;
import java.util.Arrays;

public class ArrayIntersection {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        
        //return trival(nums1, nums2);
        //alternate solution which is found in leetcode forums
        return orderOfnlogn(nums1, nums2);
    }
    
    //based on https://discuss.leetcode.com/topic/46955/97-52-o-n-log-n-java-solution-merging/2
    public int[] orderOfnlogn(int[] nums1, int[] nums2) {
        //first sort both arrays. Assuming it is not sorted
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        
        int i =0;
        int j =0;
        int k =0;
        
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                if(k==0 || result[k-1] != nums1[i]) {
                    result[k++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(result, k);
    }
    
    public int[] trival(int[] nums1, int[] nums2) {
        HashSet<Integer> sh = new HashSet<>();
        for(int i = 0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    sh.add(nums1[i]);
                }
            }
        }
        
        int i=0;
        int[] result = new int[sh.size()];
        for (Integer integer : sh) {
          result[i++] = integer;  
        }
        return result;
        
    }
}
