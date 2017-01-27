package dp;

public class StairClimbingPuzzle {
    
    public int possibleWays(int n ) {
        
        if(n < 1) {
            return 0;
        }
            return 1 + possibleWays(n-1) + possibleWays(n-2) + possibleWays(n-3);
    }
    
    public int dpPossibleWays(int n, int[] dyn) {
        
        if(n < 1 ) {
            return 0;
        }
        if(dyn[n] > 0) {
            return dyn[n];
        }
        
        dyn[n] = 1 + dpPossibleWays(n-1, dyn) + dpPossibleWays(n-2, dyn) + dpPossibleWays(n-3, dyn);
        
        return dyn[n];
    }
}