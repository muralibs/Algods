import java.util.Collections;
import java.util.PriorityQueue;

/*
 * http://www.programcreek.com/2015/01/leetcode-find-median-from-data-stream-java/
 */
public class RunningMedian {
    
    private PriorityQueue<Integer> maxHeap; 
    private PriorityQueue<Integer> minHeap;
    
    public RunningMedian() {
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap = new PriorityQueue<Integer>();
    }
    
    public void add(int x) {
       maxHeap.offer(x);
       minHeap.offer(maxHeap.poll());
       
       if(maxHeap.size() < minHeap.size()) {
           maxHeap.offer(minHeap.poll());
       }
   }

    
    public double findMedian() {
        System.out.println("Max Heap elements: " + maxHeap.toString());
        System.out.println("Min Heap elements: " + minHeap.toString());
        if(maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek())/2;
        }
        
        return maxHeap.peek();
    }
}
