class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        for(int i = 0; i < nums.length; i++){
            if(i != nums.length - 1){
                if(nums[i] + 1 != nums[i+1]){
                    target = nums[i] + 1;
                    break;
                }
            }
            else{
                if(nums[i] + 1 <= nums.length){
                    target = nums.length;
                }
            }
        }
        return target;
    }
}