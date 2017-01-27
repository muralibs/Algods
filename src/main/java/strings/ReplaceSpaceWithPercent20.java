/*
 * http://algorithms.tutorialhorizon.com/replace-all-spaces-in-a-string-with/
 */

package strings;

public class ReplaceSpaceWithPercent20 {
    
    public String replace(String input) {
        
        if(null == input || input.isEmpty()) {
            return null;
        }
        //find the number of spaces in the input string. 
        
        char[] charArray = input.toCharArray();
        
        int spaces =0;
        
        for(int i =0; i< charArray.length; i++) {
            
            if(charArray[i] == ' ') {
                spaces++;
            }
        }
        
        //create a result string which will be bigger than the input
        int resultArrayLength = charArray.length + 2 * spaces; // because each space is converted into 3 characters
        char[] resultArray = new char[resultArrayLength];
        int index =0;
        for(int  i =0; i< charArray.length; i++) {
            
            if(charArray[i] == ' ') {
                resultArray[index++] = '%';
                resultArray[index++] = '2';
                resultArray[index++] = '0';
            } else {
                resultArray[index++] = charArray[i];
            }         
        }
        
        return new String(resultArray);
        
        
    }
    
    
}
