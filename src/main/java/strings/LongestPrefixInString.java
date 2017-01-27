/*
 * http://algorithms.tutorialhorizon.com/find-the-longest-sequence-of-prefix-shared-by-all-the-words-in-a-string/
 */

package strings;

public class LongestPrefixInString {
    
    
    public String findPrefix(String input) {
        
        String prefix = "";
        
        if(null == input) {
            return null;
        }
        
        String[] strArr = input.split(" ");
    
        //get the shortest array element     

        String shortest = null;
        
        int shortestLength =Integer.MAX_VALUE;
        
        for(int i =0; i< strArr.length ; i++ ) {
            if(strArr[i].length() < shortestLength) {
                shortest = strArr[i];
                shortestLength = strArr[i].length();
            }
        }
        
        System.out.println("Shortest of all : " + shortest);
        
        boolean prefixFound = true;
        for(int i =0; i< shortestLength; i++ ) {
            
            for(int j =0; j < strArr.length; j++) {
                if(shortest.charAt(i) != strArr[j].charAt(i)) {
                    prefixFound = false;
                    break;
                }
            }
            
            if(prefixFound) {
                prefix += shortest.charAt(i);   
            }
                
        }
        
        return prefix;
    }
    
    
    
}
