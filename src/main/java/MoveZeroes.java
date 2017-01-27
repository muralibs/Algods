
public class MoveZeroes {
    
    
    public void move(int[] nums) {
        //found this super solution in leetcode discussion. Seems everyone is copying it
    //Everyone including me is ashamed of our own version.
        int idx = 0;
        
        for(int i: nums) {
            if(i != 0) {
                nums[idx++] = i;
            }
        }
        
        
        System.out.println("index = " + idx);    
        for (; idx < nums.length; idx++) {
            nums[idx] = 0;
        }
       
        
    }
}
