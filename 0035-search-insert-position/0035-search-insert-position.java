class Solution {
    public int search(int[] nums, int target) {
        int mid , low = 0;
        int high  = nums.length - 1;
        while(low <= high){
            mid = (low + high)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public int searchInsert(int[] nums, int target) {
        int pos = search(nums , target);
        if(pos == -1){
            for(int i = 0; i < nums.length; i++){
                if(i != nums.length - 1){
                    if(nums[i] > target){
                        pos = i;
                        break;
                    }
                }
                else{
                    if(nums[i] > target){
                        pos = i;
                    }
                    else{
                        pos = nums.length;
                    }
                }
            }
        }
        return pos;
    }
}