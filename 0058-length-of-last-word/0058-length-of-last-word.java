class Solution {
    public int lengthOfLastWord(String s) {
        String [] inputArr = s.split(" ");
        return inputArr[inputArr.length - 1].length();
    }
}