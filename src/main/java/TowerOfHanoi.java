/**
 * http://www.javawithus.com/programs/towers-of-hanoi
 */
public class TowerOfHanoi {
    
    public void solve(int discs, String start, String aux, String end) {
        
        if(discs == 1) {
            System.out.println(start + " -> " +  end);
            return;
        } else {
            solve(discs -1, start, end, aux );
            System.out.println(start + " -> " + end);
            solve(discs -1, aux, start, end);
        }
        
        
    }
    
}
