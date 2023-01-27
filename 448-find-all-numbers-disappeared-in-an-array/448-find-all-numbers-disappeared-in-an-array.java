import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer , Integer> numRecord = new HashMap<Integer , Integer>();
        int n = nums.length;
        ArrayList<Integer> outputArr = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(!numRecord.containsKey(nums[i])){
                numRecord.put(nums[i] , 1);
            }
        }
        for(int i = 1; i <= n; i++){
            if(!numRecord.containsKey(i)){
                outputArr.add(i);
            }
        }
        return outputArr;
    }
}