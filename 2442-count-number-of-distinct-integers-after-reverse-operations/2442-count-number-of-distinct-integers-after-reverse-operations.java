import java.lang.StringBuilder;
import java.util.*;
class Solution {
    public int reverseNum(int num){
        String reversedNum;
        String numStr = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        sb.append(numStr);
        sb.reverse();
        reversedNum = sb.toString();
        return Integer.parseInt(reversedNum);
    }

    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer , Integer> frequencyRec = new HashMap<Integer , Integer>();
        int oldSize = nums.length;
        int newSize = oldSize * 2;
        int [] temp = new int[newSize];
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        nums = temp;
        for(int i = 0; i < oldSize; i++){
            if(nums[i] % 10 == nums[i]){
                nums[i + oldSize] = nums[i];
            }
            else{
                nums[i + oldSize] = reverseNum(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(!frequencyRec.containsKey(nums[i])){
                frequencyRec.put(nums[i] , 1);
            }
        }
        return frequencyRec.size();
    }
}