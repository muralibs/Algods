//http://quiz.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/

import java.util.*;
public class GreedyMinCoins {
    
    private int[] denominations = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    
    public void printMinCoins(int value) {
        List<Integer> result = new LinkedList();
        int n = denominations.length;
        for(int i = n-1; i>=0 ; i -- ) {
            
            while(value >= denominations[i]) {
                
                value -= denominations[i];
                result.add(denominations[i]);
               // System.out.println("New Value :" + value + " , selected deno : " + denominations[i]);
            }
        }
        
        for(Integer i : result) {
            System.out.print(" " + i);
        }
        
    }
}
