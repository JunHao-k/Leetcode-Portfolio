class Solution {
    public int[] plusOne(int[] digits) {
        boolean carryForwardFlag = false;
        boolean newArrayNeeded = false;
       if(digits[digits.length - 1] + 1 != 10){
            digits[digits.length - 1] += 1;
            return digits;
       }
       else{
        carryForwardFlag = true;
       }

       for(int i = digits.length - 1; i >= 0; i--){
        if(!carryForwardFlag){
            break;
        }
        if(i == digits.length - 1){
            digits[digits.length - 1] = 0;
        }
        else{
            if(digits[i] + 1 == 10){
                digits[i] = 0;
            }
            else{
                digits[i] += 1;
                carryForwardFlag = false;
            }
        }
        if(i == 0 && carryForwardFlag == true){
            newArrayNeeded = true;
            digits[i] = 0;
        }
       }
       if(newArrayNeeded){
        int[] newArr = new int[digits.length + 1];
        for(int i = 0; i < digits.length + 1; i++){
            if(i == 0){
                newArr[i] = 1;
            }
            else{
                newArr[i] = digits[i - 1];
            }
        }
        return newArr;
       }
       return digits;
    }
}