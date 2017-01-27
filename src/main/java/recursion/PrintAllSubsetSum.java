/*
 * http://algorithms.tutorialhorizon.com/print-all-possible-subsets-with-sum-equal-to-a-given-number/
 * 
 */
package recursion;

public class PrintAllSubsetSum {
    
    public void print(int n, String x) {
        
        if(n == 0) { //base case
            System.out.println(x);
            return;
        }  else {
            
            for(int i = 1; i<=n; i++) {
                x = x + i;
                print(n-i,x);
                x = x.substring(0,x.length()-1);
            }
        }
        
        
        
    }
}
