import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateMap = new HashMap<Integer, Integer>();
        boolean hasDuplicate = false;
        for(int i = 0; i < nums.length; i++){
            if(duplicateMap.containsKey(nums[i])){
                duplicateMap.put(nums[i] , duplicateMap.get(nums[i]) + 1);
            }
            else{
                duplicateMap.put(nums[i] , 1);
            }
        }
        for(Map.Entry<Integer , Integer> eachEntry : duplicateMap.entrySet()){
            if(eachEntry.getValue() > 1){
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
    }
}