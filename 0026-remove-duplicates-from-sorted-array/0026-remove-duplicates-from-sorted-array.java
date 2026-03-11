class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Integer> checkStack = new Stack<>();
        int checkNum = 0;
        int uniqueCount = 0;
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(numStack.isEmpty() || numStack.peek() != nums[i]){
                numStack.push(nums[i]);
            }
            else{
                numStack.pop();
                numStack.push(nums[i]);
            }
        }
        while(!numStack.isEmpty()){
            checkStack.push(numStack.pop());
        }
        checkNum = checkStack.size();
        for(int i = 0; i<nums.length; i++){
            if(i >= checkNum){
                nums[i] = 9;
            }
            else{
                nums[i] = checkStack.pop();
            }
        }
        return checkNum;
    }
}