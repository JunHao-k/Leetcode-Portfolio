class Solution {
    public String getPermutation(int n, int k) {
        List<String> numList = getNumList(n);
        int startingFactorial = getFactorial(n);
        StringBuilder sb = new StringBuilder();
        if(k == 1){
            return getSpecialCase(numList, true, sb);
        }
        if(k == startingFactorial){
            return getSpecialCase(numList, false, sb);
        }
        return getNumber(numList, n, k, startingFactorial, sb);
    }

    private String getSpecialCase(List<String> numList, boolean isOriginal, StringBuilder sb){
        if(isOriginal){
            for(int i = 0; i < numList.size(); i++){
                sb.append(numList.get(i));
            }
            return sb.toString();
        }
        for (int i = numList.size() - 1; i >= 0; i--) {
            sb.append(numList.get(i));
        }
        return sb.toString();
    }
    
    private List<String> getNumList(int n){
        List<String> numList = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            numList.add(String.valueOf(i+1));
        }
        return numList;
    }
    private int getFactorial(int n){
        int factorial = 1;
        for(int i = n; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
    private String getNumber(List<String> numList, int n, int k, int facValue, StringBuilder sb){
        int partNum = facValue/n; // Find the number of distinct combinations for each part
        if(numList.size() == 1){
            sb.append(numList.get(0));
            return sb.toString();
        }
        if(k == facValue || k % facValue == 0){
            String remainingStr = getSpecialCase(numList, false, sb);
            return remainingStr;
        }

        if(k > facValue){
            int newK;
            if(k % facValue == 0){
                newK = k/facValue;
            }
            else{
                newK = k % facValue;
            }
            return getNumber(numList, n, newK, facValue, sb);
        }
        

        int targetIndex;
        if(k % partNum > 0){
            targetIndex = k/partNum;
        }
        else{
            // This condition is to cater for k % partNum == 0, will never be < 0
            targetIndex = k/partNum - 1;
        }
        sb.append(numList.get(targetIndex));
        numList.remove(targetIndex);
        return getNumber(numList, n-1, k, facValue/n , sb);
    }
}