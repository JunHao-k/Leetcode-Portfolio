import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String allLower = s.toLowerCase();
        String noAlphaNumeric = allLower.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder();
        for(int i = noAlphaNumeric.length() - 1; i >= 0; i--){
            sb.append(noAlphaNumeric.charAt(i));
        }
        String reverseStr = sb.toString();
        return (noAlphaNumeric.equals(reverseStr));
    
    }
}