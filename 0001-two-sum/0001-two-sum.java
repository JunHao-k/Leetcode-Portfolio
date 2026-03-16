class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndex = new HashMap<>();
        int[] indicesArr = new int[2];
        int checkValue;
        for(int i = 0; i < nums.length; i++){
            numIndex.put(nums[i] , i);
        }
        for(int i = 0; i < nums.length; i++){
            checkValue = target - nums[i];
            if(checkValue == nums[i]){
                if(numIndex.get(checkValue) == i){
                    continue;
                }
            }
            if(numIndex.containsKey(checkValue)){
                indicesArr[0] = i;
                indicesArr[1] = numIndex.get(checkValue);
                break;
            }
        }
        return indicesArr;
    }
}