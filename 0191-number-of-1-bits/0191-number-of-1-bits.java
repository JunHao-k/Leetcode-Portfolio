public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String original = Integer.toBinaryString(n);
        int count = 0;
        System.out.println(original);
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) == '1'){
                System.out.println("check" + i);
                count++;
            }
        }
        return count;
    }
}