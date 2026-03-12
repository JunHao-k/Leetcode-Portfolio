class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int tempNum = x;
        while(tempNum%10 != tempNum){
            queue.add(tempNum%10);
            tempNum = tempNum/10;
        }
        queue.add(tempNum);
        while(queue.size() != 0){
            sb.append(String.valueOf(queue.poll()));
        }
        String checkString = sb.toString();
        String original = String.valueOf(x);
        return original.equals(checkString);
    }
}