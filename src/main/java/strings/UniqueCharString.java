 /*
  * http://algorithms.tutorialhorizon.com/find-out-whether-string-contains-all-the-unique-characters/
  */
package strings;

import java.util.*;

public class UniqueCharString {
    
    public boolean isUnique(String input) {
        //Get the char array and sort it. check the adjecent elements. if they are equal, its not unique
        
        char[] charArr = input.toCharArray();
        
        Arrays.sort(charArr);
        boolean isUnique = true;
        for(int i =0; i< charArr.length-1; i++) {
            
            if(charArr[i] == charArr[i+1]) {
                isUnique = false;
                break;
            }
        }
        
        return isUnique;
    }
    
    
}
