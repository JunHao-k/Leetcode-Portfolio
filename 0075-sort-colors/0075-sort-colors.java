import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> sortedQueue = new PriorityQueue<Integer>();
        for(int i = 0; i < nums.length; i++){
            sortedQueue.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = sortedQueue.poll();
        }
    }
}