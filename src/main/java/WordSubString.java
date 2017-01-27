//Cracking the coding interview
public class WordSubString {
    
    public boolean isSubString(String input, String ref) {
        if(input == null || input.isEmpty()) return false;
        
        String newInput = input+input;
        
        if(newInput.contains(ref)) {
            return true;
        }
        
        return false;
    }
}
