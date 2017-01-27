/*
 * http://algorithms.tutorialhorizon.com/generate-all-strings-of-n-bits/
 */
package strings;
import java.util.Arrays;

public class NBitStrings {
    
    private int[] a ;
    
    public NBitStrings(int n) {
        this.a = new int[n];
    }
    
    public void generate(int n) {
        
        if(n <= 0) {
            System.out.println(Arrays.toString(a));
        } else {
            a[n-1] = 1;
            generate(n-1);
            System.out.println(Arrays.toString(a));
            a[n-1] = 0;
            generate(n-1);
            
        }
        
        
    }
}
