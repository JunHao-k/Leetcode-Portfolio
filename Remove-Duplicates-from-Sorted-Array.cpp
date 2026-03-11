1class Solution {
2    public int removeDuplicates(int[] nums) {
3        Stack<Integer> numStack = new Stack<>();
4        Stack<Integer> checkStack = new Stack<>();
5        int checkNum = 0;
6        int uniqueCount = 0;
7        if(nums.length == 1){
8            return 1;
9        }
10        if(nums.length == 0){
11            return 0;
12        }
13        for(int i = 0; i < nums.length; i++){
14            if(numStack.isEmpty() || numStack.peek() != nums[i]){
15                numStack.push(nums[i]);
16            }
17            else{
18                numStack.pop();
19                numStack.push(nums[i]);
20            }
21        }
22        while(!numStack.isEmpty()){
23            checkStack.push(numStack.pop());
24        }
25        checkNum = checkStack.size();
26        for(int i = 0; i<nums.length; i++){
27            if(i >= checkNum){
28                nums[i] = 9;
29            }
30            else{
31                nums[i] = checkStack.pop();
32            }
33        }
34        return checkNum;
35    }
36}