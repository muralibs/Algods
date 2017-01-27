import java.util.Arrays;

public class Anagram {
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        int i=0;
        boolean result = true;
        
        while(i<sArr.length) {
            if(sArr[i] != tArr[i]) {
                result = false;
                break;
            }
            i++;
        }
        
        return result;
    }
}

