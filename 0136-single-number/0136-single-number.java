import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(numMap.containsKey(nums[i])){
                numMap.put(nums[i] , numMap.get(nums[i]) + 1);
            }
            else{
                numMap.put(nums[i] , 1);
            }
        }
        for(Map.Entry<Integer, Integer> eachEntry : numMap.entrySet()){
            if(eachEntry.getValue() == 1){
                ans = eachEntry.getKey();
            }
        }
        return ans;
    }
}