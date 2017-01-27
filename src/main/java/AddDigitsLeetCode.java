
public class AddDigitsLeetCode {
    
    public int addDigits1(int num) {
        //digital roots formula
        return (1 + (num - 1)%9);
    }
    
    
    public int addDigits(int num) {
        
        //if num < 10 return
        if(num < 10) {
            return num;
        }
        
        if (num == 10) {
            return 1;
        }
        int f = num;
        int q = 0;
        int r = 0;
        do {
           //System.out.println("in do ");
            q = f / 10;
            r = f % 10;
            f = q+r;
            //System.out.println("q : " + q + " r : " + r + "f : " + f);
        } while ( f >= 10);
        
        
        
        return f;
    }
}
