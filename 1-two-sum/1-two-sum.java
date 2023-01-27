import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, String> numMap = new HashMap<Integer, String>();
        int [] indicesArr = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(numMap.containsKey(nums[i]) == false){
                numMap.put(nums[i] , Integer.toString(i));
            }
            else{
                numMap.put(nums[i] , numMap.get(nums[i]) + i);
            }
            
        }
        for(Map.Entry<Integer , String> eachEntry : numMap.entrySet()){
            int indices2 = target - (int)eachEntry.getKey(); //3
            int indices1 = (int)eachEntry.getKey(); //3
            if(numMap.containsKey(indices2)){
                if(indices1 != indices2){
                    indicesArr[0] = Integer.parseInt(eachEntry.getValue());
                    indicesArr[1] = Integer.parseInt(numMap.get(indices2));
                    break;
                }
                else{
                    indicesArr[0] = (int)eachEntry.getValue().charAt(0) - 48;
                    indicesArr[1] = (int)eachEntry.getValue().charAt(1) - 48;
                    break;
                }
                
            }
        }
        return indicesArr;
    }
}