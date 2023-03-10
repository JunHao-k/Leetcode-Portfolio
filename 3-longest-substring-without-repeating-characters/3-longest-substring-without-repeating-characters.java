import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> charRecord = new HashMap<Character , Integer>();
        ArrayList<Character> longestSubStr = new ArrayList<>();
        int sequenceCount = 0;
        boolean haveRecurring = false;
        // For strings with one character only
        if(s.length() == 1){
            return 1;
        }
        for(int i = 0; i < s.length(); i++){
            char target = s.charAt(i); 
            if(charRecord.containsKey(target)){
                haveRecurring = true;
                i = charRecord.get(target) + 1;
                int temp = longestSubStr.size(); 
                if(temp > sequenceCount){
                    sequenceCount = temp;
                }
                longestSubStr.clear();
                charRecord.clear();
                charRecord.put(s.charAt(i) , i);
                longestSubStr.add(s.charAt(i));
            }
            else{
                charRecord.put(target , i);
                longestSubStr.add(target);
            }
        }
        // For special cases like "aab"
        if(longestSubStr.size() > sequenceCount){
            sequenceCount = longestSubStr.size();
        }
        // Set a flag for s where all characters are unique E.g. "au"
        if(!haveRecurring){
            return longestSubStr.size();
        }
        return sequenceCount;
    }
}