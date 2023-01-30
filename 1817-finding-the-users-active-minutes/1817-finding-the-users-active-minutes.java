import java.util.*;
import java.lang.StringBuilder;
import java.lang.String;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        StringBuilder sb = new StringBuilder();
        int answer [] = new int[k];
        HashMap<String , Integer> UAM = new HashMap<String , Integer>();
        HashMap<Integer , Integer> uamRecord = new HashMap<Integer , Integer>();
        for(int i = 0; i < logs.length; i++){
            sb.setLength(0);
            String id = String.valueOf(logs[i][0]);
            String time = String.valueOf(logs[i][1]);
            sb.append(id);
            sb.append(",");
            sb.append(time);
            String UAMkey = sb.toString();
            if(!UAM.containsKey(UAMkey)){
                UAM.put(UAMkey , 1);
            }
            System.out.println(UAMkey);
        }
        for(Map.Entry<String, Integer> eachEntry : UAM.entrySet()){
            String [] IDTimeArr = eachEntry.getKey().split(",");
            int ID = Integer.parseInt(IDTimeArr[0]);
            if(!uamRecord.containsKey(ID)){
                uamRecord.put(ID , 1);
            }
            else{
                uamRecord.replace(ID , uamRecord.get(ID) , uamRecord.get(ID) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> eachEntry : uamRecord.entrySet()){
            int index = eachEntry.getValue() - 1;
            answer[index]++;

        }
        return answer;
    }
}